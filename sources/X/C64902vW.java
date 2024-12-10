package X;

import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2vW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64902vW implements AnonymousClass1GV {
    public final /* synthetic */ AnonymousClass1GV A00;
    public final /* synthetic */ C27191Vc A01;
    public final /* synthetic */ AnonymousClass1E7 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void accept(Object obj) {
        Object obj2;
        C32071ga r0;
        C27191Vc r8 = this.A01;
        AnonymousClass1E7 r9 = this.A02;
        String str = this.A03;
        AnonymousClass1GV r10 = this.A00;
        String str2 = this.A04;
        C55782gM r14 = (C55782gM) obj;
        boolean A1W = AnonymousClass000.A1W(str);
        C21456AkN akN = new C21456AkN(r8, r9, r10, str2, 16);
        if (!(r9 == null || r9.A07() == null)) {
            String A07 = r9.A07();
            if (r14.A00 != null) {
                r8.A02.A04(r14);
                try {
                    byte[] bArr = r14.A00;
                    obj2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (obj2 != null) {
                        r0 = r8.A01.A02.A04();
                    }
                } catch (OutOfMemoryError e) {
                    Log.e("contactPhotosBitmapManager/decode-bitmap/out-of-memory ", e);
                    obj2 = null;
                }
                r10.accept(obj2);
                return;
            } else if (r14.A01 == -1) {
                Log.e("contactPhotosBitmapManager/handleProfilePhoto/group-removed-photo");
                r8.A02.A03(r14.A03);
            } else {
                C24791Lr r2 = r8.A01;
                C24771Lp r1 = r2.A02;
                obj2 = r1.A04().A0A(A07);
                if (obj2 == null) {
                    File A012 = r2.A01(r9);
                    if (A012 != null) {
                        try {
                            obj2 = BitmapFactory.decodeFile(A012.getAbsolutePath());
                            if (obj2 != null) {
                                r0 = r1.A04();
                            }
                        } catch (OutOfMemoryError e2) {
                            Log.e("contactPhotosBitmapManager/decode-bitmap/out-of-memory ", e2);
                        }
                    }
                    if (A1W) {
                        akN.run();
                        return;
                    }
                }
                r10.accept(obj2);
                return;
            }
            r0.A0F(A07, obj2);
            r10.accept(obj2);
            return;
        }
        r10.accept((Object) null);
    }

    public /* synthetic */ C64902vW(AnonymousClass1GV r1, C27191Vc r2, AnonymousClass1E7 r3, String str, String str2) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A04 = str2;
    }
}
