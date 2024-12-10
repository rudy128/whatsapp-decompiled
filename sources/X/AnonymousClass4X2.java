package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.4X2  reason: invalid class name */
public class AnonymousClass4X2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Float A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final String A0C;

    public AnonymousClass4X2() {
        this((Float) null, (Integer) null, (Integer) null, (String) null, 0, 0, 0, 0, 0, 8191);
    }

    public /* synthetic */ AnonymousClass4X2(Float f, Integer num, Integer num2, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = null;
        i = (i6 & 1) != 0 ? 2131233259 : i;
        f = (i6 & 2) != 0 ? null : f;
        int i8 = (i6 & 4) != 0 ? 2131892272 : 0;
        i2 = (i6 & 8) != 0 ? 2131892269 : i2;
        i7 = (i6 & 16) != 0 ? 2131892271 : i7;
        int i9 = (i6 & 32) != 0 ? 2131892265 : 0;
        i3 = (i6 & 64) != 0 ? 2131892266 : i3;
        int i10 = (i6 & 128) != 0 ? 2131892268 : 0;
        i4 = (i6 & 256) != 0 ? 2131233458 : i4;
        i5 = (i6 & 512) != 0 ? 2131233429 : i5;
        num = (i6 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 ? 2131101303 : num;
        num2 = (i6 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 ? 2131101303 : num2;
        str = (i6 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 ? "https://faq.whatsapp.com/785493319976156" : str;
        C18070vi.A0d(str, 13);
        this.A06 = i;
        this.A08 = f;
        this.A07 = i8;
        this.A05 = i2;
        this.A09 = i7;
        this.A00 = i9;
        this.A04 = i3;
        this.A02 = i10;
        this.A03 = i4;
        this.A01 = i5;
        this.A0B = num;
        this.A0A = num2;
        this.A0C = str;
    }
}
