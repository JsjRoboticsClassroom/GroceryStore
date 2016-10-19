package nyc.c4q.tools;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ImageUtils {

    private static final int BUFFER_SIZE = 1024;

    public static Bitmap inflateImageFromFile(Context context, String filePath, int widthDp, int heightDp) {
        InputStream stream;
        try {
            stream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        byte[] data = inputStreamToByteArray(stream);
        BitmapFactory.Options sourceAttributes = readImageAttributes(data);
        int inSampleSize = calculateInSampleSize(sourceAttributes, dpToPixels(context, widthDp), dpToPixels(context, heightDp));
        return decodeBitmapFromByteArray(sourceAttributes, inSampleSize, data);
    }

    private static Bitmap decodeBitmapFromByteArray(BitmapFactory.Options sourceAttributes, int inSampleSize, byte[] data) {
        sourceAttributes.inSampleSize = inSampleSize;
        sourceAttributes.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(data,0,data.length, sourceAttributes);
    }

    private static byte[] inputStreamToByteArray(InputStream stream) {
        if(stream == null){
            return null;
        }
        byte[] buffer = new byte[BUFFER_SIZE];
        byte[] result = new byte[0];
        ArrayList<Byte> data = new ArrayList<>();
        try {
            int bytesRead = stream.read(buffer);
            while(bytesRead != -1){
                for(int index =0; index < bytesRead; index++){
                    data.add(buffer[index]);
                }
                bytesRead = stream.read(buffer);
            }
            result = new byte[data.size()];
            for(int index = 0; index < result.length; index++){
                result[index] = data.get(index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private static BitmapFactory.Options readImageAttributes(byte[] data){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(data, 0, data.length, options);
        return options;
    }

    private static int calculateInSampleSize(
            BitmapFactory.Options options,
            float reqWidth,
            float reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

    private static float dpToPixels(Context context, int valueInDp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp , context.getResources().getDisplayMetrics());
    }
}
