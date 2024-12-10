package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.1py  reason: invalid class name and case insensitive filesystem */
public final class C37691py {
    public final AnonymousClass1KB A00;
    public final C25161Nd A01;
    public final C37681px A02;
    public final AnonymousClass11P A03;
    public final C22621Co A04;
    public final AnonymousClass10I A05;
    public final WeakReference A06;
    public final AnonymousClass1Nb A07;

    public C37691py(Context context, AnonymousClass1KB r3, C25161Nd r4, C37681px r5, AnonymousClass11P r6, C22621Co r7, AnonymousClass1Nb r8, AnonymousClass10I r9) {
        C18070vi.A0d(context, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r9, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r4, 7);
        C18070vi.A0d(r5, 8);
        this.A03 = r6;
        this.A00 = r3;
        this.A05 = r9;
        this.A04 = r7;
        this.A07 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A06 = new WeakReference(context);
    }

    public final boolean A00(AnonymousClass1BI r5) {
        C70633Bw r1;
        C18070vi.A0d(r5, 0);
        Set A0f = this.A07.A0f();
        C18070vi.A0X(A0f);
        int size = A0f.size();
        AnonymousClass10I r2 = this.A05;
        if (size >= 3) {
            r1 = new C70633Bw(this, A0f, 5);
        } else {
            r1 = new C70633Bw(this, r5, 6);
        }
        r2.CGF(r1);
        return true;
    }
}
