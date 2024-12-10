package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AeG  reason: case insensitive filesystem */
public class C21086AeG implements AnonymousClass3M2 {
    public boolean A00 = false;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C195529tU A04;
    public final /* synthetic */ C20114A7x A05;
    public final /* synthetic */ C19957A0o A06;
    public final /* synthetic */ AnonymousClass22Q A07;
    public final /* synthetic */ C32021gV A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ void BuW() {
    }

    public /* synthetic */ void CN4(View view) {
    }

    public C21086AeG(Context context, View view, C195529tU r4, C20114A7x a7x, C19957A0o a0o, AnonymousClass22Q r7, C32021gV r8, int i, boolean z, boolean z2) {
        this.A07 = r7;
        this.A02 = context;
        this.A05 = a7x;
        this.A09 = z;
        this.A0A = z2;
        this.A01 = i;
        this.A04 = r4;
        this.A06 = a0o;
        this.A08 = r8;
        this.A03 = view;
    }

    public int BZK() {
        return this.A08.A0A(this.A03.getContext());
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r36) {
        C20005A2v a2v;
        A6S a6s;
        ByteArrayInputStream byteArrayInputStream;
        Bitmap bitmap2 = bitmap;
        if (!this.A00) {
            this.A00 = true;
            if (bitmap == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) {
                bitmap2 = null;
            }
            AnonymousClass22Q r3 = this.A07;
            Context context = this.A02;
            String str = r3.A06;
            Activity A002 = C18050vg.A00(context);
            if (A002 instanceof C108885cS) {
                a2v = ((C108885cS) A002).getCatalogLoadSession();
                if (bitmap2 != null) {
                    StringBuilder A11 = AnonymousClass000.A11(str);
                    A11.append('_');
                    String A0t = C17880vN.A0t(A11, 3);
                    C191899nN A012 = a2v.A01();
                    if (A012.A01 != null) {
                        try {
                            ByteArrayOutputStream A15 = C108945cZ.A15();
                            bitmap2.compress(Bitmap.CompressFormat.JPEG, 80, A15);
                            byteArrayInputStream = new ByteArrayInputStream(A15.toByteArray());
                            C1192567j r0 = A012.A01;
                            String A042 = C17970vW.A04(A0t);
                            C17960vV.A07(A042);
                            r0.A03.A04(byteArrayInputStream, A042);
                            byteArrayInputStream.close();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            AnonymousClass0DT.A00(th, th);
                        }
                    }
                }
            } else {
                a2v = null;
            }
            ArrayList A13 = AnonymousClass000.A13();
            for (int i = 0; i < r3.A00; i++) {
                if (i != 0 || a2v == null || bitmap2 == null) {
                    A13.add((Object) null);
                } else {
                    A13.add(new AEI(str, "", "", bitmap2.getWidth(), bitmap2.getHeight()));
                }
            }
            String str2 = r3.A0A;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = r3.A04;
            if (str3 == null) {
                str3 = "";
            }
            BigDecimal bigDecimal = r3.A0B;
            if (TextUtils.isEmpty(r3.A03)) {
                a6s = null;
            } else {
                a6s = new A6S(r3.A03);
            }
            String str4 = r3.A07;
            String str5 = r3.A08;
            ArrayList A132 = AnonymousClass000.A13();
            AEJ aej = new AEJ((String) null, (String) null, (List) null, 0, false);
            C18070vi.A0d(str, 1);
            C20287AEv aEv = new C20287AEv((ADH) null, (C20255ADn) null, aej, (AE5) null, (AE6) null, a6s, str, str2, str3, str4, (String) null, str5, (String) null, bigDecimal, A13, A132, 0, 99, false, false);
            this.A05.A0I(aEv, (UserJid) null);
            UserJid userJid = r3.A01;
            C17960vV.A07(userJid);
            String str6 = aEv.A0H;
            boolean z = this.A09;
            boolean z2 = this.A0A;
            C20057A5g.A03(context, this.A04, this.A06, userJid, (Integer) null, (Integer) null, str6, this.A01, z, z2, false);
            return;
        }
        return;
        throw th;
    }
}
