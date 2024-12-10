package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Yy  reason: invalid class name and case insensitive filesystem */
public abstract class C88254Yy {
    public static View.OnClickListener A00(Context context, AnonymousClass11S r8, AnonymousClass689 r9, AnonymousClass219 r10, boolean z) {
        AnonymousClass219 r3 = r10;
        UserJid A0I = r10.A0I();
        boolean z2 = r10.A0v.A02;
        UserJid userJid = A0I;
        if (z2) {
            userJid = null;
        }
        AnonymousClass11S r4 = r8;
        Context context2 = context;
        if (r8.A0N()) {
            return new C89904dD(context, 45);
        }
        AnonymousClass689 r5 = r9;
        if (z) {
            return new AnonymousClass48k(context, r9, r3, userJid, 3);
        }
        return new AnonymousClass6LH(context2, r3, r4, r5, A0I, 1);
    }

    public static String A01(Context context, AnonymousClass11S r13, AnonymousClass11P r14, C18000vb r15, C27131Uv r16, AnonymousClass219 r17, boolean z) {
        int i;
        long A0I;
        if (r13.A0N()) {
            i = 2131891778;
        } else if (z) {
            AnonymousClass219 r4 = r17;
            long j = r4.A0I + ((long) (r4.A00 * 1000));
            C27131Uv r1 = r16;
            if (r4.A0v.A02) {
                A0I = r1.A0J(r4);
            } else {
                A0I = r1.A0I(r4);
            }
            long A09 = r14.A09(A0I);
            Object[] objArr = new Object[1];
            if (A0I > AnonymousClass11P.A01(r14)) {
                return A8I.A01(r15, C17880vN.A0q(context, A8I.A00(r15, A09), objArr, 0, 2131891774), A09);
            }
            return A8I.A01(r15, C17880vN.A0q(context, A8I.A00(r15, j), objArr, 0, 2131891774), j);
        } else {
            i = 2131891786;
        }
        return context.getString(i);
    }

    public static boolean A02(AnonymousClass11P r6, AnonymousClass219 r7, long j) {
        long A01 = AnonymousClass11P.A01(r6);
        long A03 = r7.A0I + C17890vO.A03(r7.A00);
        if (!r7.A0v.A02) {
            if (j <= A01) {
                return false;
            }
            return true;
        } else if ((j != -1 || A03 <= A01) && j <= A01) {
            return false;
        } else {
            return true;
        }
    }
}
