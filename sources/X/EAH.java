package X;

import android.graphics.Bitmap;

public interface EAH {
    boolean doesRenderSupportScaling();

    Bitmap.Config getAnimatedBitmapConfig();

    C28591E9g getFrame(int i);

    int getFrameCount();

    int[] getFrameDurations();

    C24988CSo getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getSizeInBytes();

    int getWidth();
}
