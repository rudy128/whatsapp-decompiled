package com.whatsapp;

import X.AnonymousClass8B2;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

public class WaMediaThumbnailView extends WaImageView {
    public Bitmap A00;
    public AnonymousClass8B2 A01;

    public final void setThumbnail(Bitmap bitmap) {
        this.A00 = bitmap;
        setImageBitmap(bitmap);
    }

    public final AnonymousClass8B2 getMediaItem() {
        return this.A01;
    }

    public final Bitmap getThumbnail() {
        return this.A00;
    }

    public final void setMediaItem(AnonymousClass8B2 r1) {
        this.A01 = r1;
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaMediaThumbnailView(Context context) {
        super(context);
    }
}
