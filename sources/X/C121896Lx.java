package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.6Lx  reason: invalid class name and case insensitive filesystem */
public class C121896Lx extends A34 {
    public final AnonymousClass84Z A00;
    public final C125726ba A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass77X A03;
    public final boolean A04;
    public final byte[] A05;

    public C121896Lx(AnonymousClass84Z r2, AnonymousClass1F9 r3, C125726ba r4, AnonymousClass11C r5, AnonymousClass77X r6, byte[] bArr, boolean z) {
        super(r3, true);
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = bArr;
        this.A04 = z;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        StringBuilder sb;
        String str;
        FileOutputStream A19;
        AnonymousClass7DY r0 = ((C1425379v) this.A00).A00;
        C218617r r4 = r0.A0x;
        C18010vc r5 = r0.A1I;
        C26551So r6 = C26551So.A0E;
        int i = 1;
        if (C18020vd.A05(C18040vf.A02, r0.A1G, 401)) {
            i = 4;
        }
        File A0G = C26511Sk.A0G(r4, r5, r6, ".jpeg", 0, i);
        try {
            A19 = C108945cZ.A19(A0G);
            A19.write(this.A05);
            A19.close();
            return new C127076dl(new AnonymousClass7H3(this.A03, C108955ca.A0d(this.A02), A0G, 0, this.A04), A0G);
        } catch (FileNotFoundException e) {
            e = e;
            sb = AnonymousClass000.A10();
            str = "ProcessPictureTask/ File not found: ";
            Log.e(C17900vP.A0C(str, sb, e), e);
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass000.A10();
            str = "ProcessPictureTask/ Error accessing file: ";
            Log.e(C17900vP.A0C(str, sb, e), e);
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C127076dl r5 = (C127076dl) obj;
        AnonymousClass7DY r3 = this.A01.A00;
        if (r3.A0H != null) {
            AnonymousClass7DY.A03(r3, 2131434795).setVisibility(8);
            if (r5 == null) {
                r3.A0y.A08(2131887876, 1);
                if (r3.A0f) {
                    AnonymousClass7DY.A0X(r3, false);
                }
                AnonymousClass7DY.A0O(r3);
                r3.A1Y.BnQ();
                return;
            }
            AnonymousClass7DY.A0T(r3, r5.A00, (AnonymousClass65B) null, true);
        }
    }
}
