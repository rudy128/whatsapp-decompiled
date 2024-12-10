package com.facebook.smartcapture.docauth;

import X.BVO;
import X.C26548D3k;
import android.content.Context;
import android.graphics.Rect;
import java.lang.ref.WeakReference;

public final class DocAuthManager {
    public Rect A00;
    public WeakReference A01;
    public final Context A02;
    public final C26548D3k A03;
    public final BVO A04;

    private final native void initCreditCardScanner(String str, String str2, String str3);

    private final native void initCreditCardScanner(String str, String str2, String str3, int i, float f, boolean z);

    private final native DocAuthResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7);

    public DocAuthManager(Context context, C26548D3k d3k, BVO bvo) {
        this.A02 = context;
        this.A03 = d3k;
        this.A04 = bvo;
    }
}
