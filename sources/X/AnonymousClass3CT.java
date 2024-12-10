package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3CT  reason: invalid class name */
public class AnonymousClass3CT implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    public AnonymousClass3CT(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A06 = str;
        this.A01 = i;
        this.A05 = obj4;
        this.A07 = z;
    }

    public final void run() {
        FileOutputStream fileOutputStream;
        switch (this.A00) {
            case 0:
                C33251iW r5 = (C33251iW) this.A02;
                String str = this.A06;
                int i = this.A01;
                AnonymousClass206 r9 = (AnonymousClass206) this.A05;
                boolean z = this.A07;
                C62572rc r8 = new C62572rc();
                r8.A0G = (File) this.A04;
                r8.A01 = i;
                C63642tS A042 = r5.A0j.A04((Uri) null, r8, r9, (C692236j) null, str, (List) this.A03, (List) null, (List) null, 9, 7, 0, z);
                Iterator A0o = C29431cG.A0o(A042.A03);
                while (A0o.hasNext()) {
                    AnonymousClass21V A0b = C17880vN.A0b(A0o);
                    if (A0b instanceof C438921i) {
                        C438921i r1 = (C438921i) A0b;
                        r1.A00 = i;
                        r1.A06 = "text/vcard";
                        r1.A09 = str;
                    }
                }
                r5.A0n(A042, (byte[]) null, false, false);
                return;
            case 1:
                C33251iW r4 = (C33251iW) this.A02;
                Object obj = this.A03;
                String str2 = this.A06;
                byte[] bArr = (byte[]) this.A04;
                int i2 = this.A01;
                Object obj2 = this.A05;
                boolean z2 = this.A07;
                File A0k = r4.A18.A0k(str2, (long) bArr.length);
                try {
                    fileOutputStream = new FileOutputStream(A0k);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e("UserActions/prepareVCardDocument IO Exception when writing vcard document", e);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    break;
                }
                if (!A0k.exists()) {
                    Log.e("UserActions/prepareVCardDocument Error writing vcard document file");
                    return;
                } else {
                    r4.A03.CGP(new AnonymousClass3CT(r4, obj, A0k, obj2, str2, i2, 0, z2));
                    return;
                }
            default:
                AnonymousClass749 r6 = (AnonymousClass749) this.A02;
                Context context = (Context) this.A03;
                int i3 = this.A01;
                boolean z3 = this.A07;
                Number number = (Number) this.A05;
                String str3 = this.A06;
                r6.A0C.get();
                Intent putExtra = AnonymousClass1LU.A0C(context, i3).putExtra("jid", C22971Dz.A06((Jid) this.A04)).putExtra("start_t", SystemClock.uptimeMillis());
                C18070vi.A0X(putExtra);
                if (z3) {
                    putExtra.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
                }
                if (number != null) {
                    putExtra.putExtra("newsletter_log_instance_key", number.intValue());
                }
                if (str3 != null) {
                    putExtra.putExtra("wamo_pc_id", str3);
                }
                C53952dM r12 = (C53952dM) r6.A0D.get();
                C17880vN.A1D(r12.A00.edit(), "channelLastOpenedDate", ((AnonymousClass11P) r12.A01.get()).A05());
                String simpleName = context.getClass().getSimpleName();
                C18070vi.A0X(simpleName);
                C60442o2.A00(putExtra, r6.A04, simpleName);
                r6.A02.A08(context, putExtra);
                return;
        }
        throw th;
    }
}
