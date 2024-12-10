package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7QF  reason: invalid class name */
public class AnonymousClass7QF implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public AnonymousClass7QF(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A02 = obj5;
        this.A06 = z;
    }

    public void run() {
        boolean z;
        switch (this.A00) {
            case 0:
                C26154CtM ctM = (C26154CtM) this.A01;
                ((C22563BCy) this.A03).Bwv(ctM.A01, (CJ1) this.A04, (CTB) this.A05, (IOException) this.A02, ctM.A00, this.A06);
                return;
            case 1:
                AnonymousClass120 r1 = (AnonymousClass120) this.A01;
                byte[] bArr = (byte[]) this.A02;
                byte[] bArr2 = (byte[]) this.A03;
                C54492eE[] r3 = (C54492eE[]) this.A04;
                C54492eE r2 = (C54492eE) this.A05;
                boolean z2 = this.A06;
                C17960vV.A02();
                if (z2) {
                    AnonymousClass120.A00(r1);
                }
                synchronized (r1) {
                    r1.A01 = true;
                    r1.A03 = r3;
                }
                AnonymousClass1OZ A0U = C17880vN.A0U(r1.A0E);
                Message obtain = Message.obtain((Handler) null, 0, 85, 0, new C54992f2(r2, bArr, bArr2, r3));
                C18070vi.A0d(obtain, 0);
                AnonymousClass1OZ.A02(obtain, A0U, (C26971Uf) null, (String) null, 0, false);
                return;
            case 2:
                C133496or r8 = (C133496or) this.A01;
                View view = (View) this.A02;
                View view2 = (View) this.A03;
                View view3 = (View) this.A04;
                boolean z3 = this.A06;
                C136756uL r32 = (C136756uL) this.A05;
                boolean A17 = C18070vi.A17(r8, view);
                C18070vi.A0k(view2, view3);
                C18070vi.A0d(r32, 5);
                r8.A01(A17);
                view.setVisibility(8);
                view2.setVisibility(8);
                view3.setVisibility(0);
                view3.setEnabled(A17);
                if (!z3) {
                    r32.A02(false);
                    return;
                }
                return;
            case 3:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                Context context = (Context) this.A02;
                ArrayList arrayList = (ArrayList) this.A03;
                AnonymousClass73D r4 = (AnonymousClass73D) this.A04;
                Jid jid = (Jid) this.A05;
                boolean z4 = this.A06;
                contactPickerFragment.A0r.CEx();
                if (contactPickerFragment.A1b()) {
                    C139416yo r12 = new C139416yo(context);
                    r12.A01 = 3;
                    r12.A0I = arrayList;
                    C139416yo.A00(r4, r12);
                    r12.A0D = jid.getRawString();
                    r12.A0P = true;
                    r12.A0K = true;
                    r12.A02 = 25;
                    contactPickerFragment.A1k(r12.A01());
                }
                if (z4) {
                    contactPickerFragment.A2F();
                    return;
                }
                return;
            case 4:
                List list = (List) this.A02;
                UserJid userJid = (UserJid) this.A04;
                boolean z5 = this.A06;
                List list2 = (List) this.A05;
                AnonymousClass1MZ r0 = ((AnonymousClass126) this.A01).A0O;
                r0.A0F((UserJid) this.A03, list);
                if (userJid != null) {
                    r0.A0F(userJid, list);
                }
                if (z5) {
                    r0.A0H(list2);
                    return;
                }
                return;
            case 5:
                C32431hB r5 = (C32431hB) this.A01;
                C136996uk r7 = (C136996uk) this.A02;
                AnonymousClass21V r42 = (AnonymousClass21V) this.A03;
                BC9 bc9 = (BC9) this.A05;
                boolean z6 = this.A06;
                if (!C32431hB.A07(r5)) {
                    synchronized (r42) {
                        C32431hB.A01(r7, r5, r42, true);
                    }
                }
                C62572rc r13 = r42.A02;
                if (r13 != null) {
                    ((AnonymousClass168) r5.A0J.get()).A01(r13);
                    C1409173o A012 = r7.A01();
                    C17960vV.A07(A012);
                    if (bc9 != null) {
                        int i = A012.A01;
                        if (i == 13 || i == 24) {
                            if (r7.A04() != null) {
                                z = r7.A04().booleanValue();
                            } else {
                                z = false;
                            }
                            bc9.BsC(z);
                        } else {
                            bc9.BsD(A012, r7);
                        }
                    }
                    C32431hB.A04(r5, r42, A012.A01, z6);
                    return;
                }
                return;
            default:
                AnonymousClass71M r43 = (AnonymousClass71M) this.A01;
                AnonymousClass210 r52 = (AnonymousClass210) this.A02;
                Context context2 = (Context) this.A03;
                boolean z7 = this.A06;
                Object obj = this.A05;
                C18070vi.A0d(context2, 2);
                C109485dW A002 = AnonymousClass71M.A00(context2, (Drawable) this.A04, r52, r43, z7);
                if (A002 != null) {
                    C108945cZ.A0a(r43.A02).A0J(new C146617Py(r43, r52, obj, A002, 22));
                    return;
                }
                return;
        }
    }
}
