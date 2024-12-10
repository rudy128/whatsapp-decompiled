package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: X.Ct7  reason: case insensitive filesystem */
public class C26144Ct7 {
    public final AnonymousClass1F9 A00;
    public final C22700BLd A01;

    public static C26144Ct7 A00(AnonymousClass1F9 r2) {
        return new C26144Ct7(r2, ((AnonymousClass1FD) r2).Bba());
    }

    private void A01(Bundle bundle, E8R e8r, C24494C6m c6m) {
        try {
            C22700BLd bLd = this.A01;
            bLd.A01 = true;
            C24494C6m BqU = e8r.BqU(bundle);
            Class<?> cls = BqU.getClass();
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                BLY bly = new BLY(bundle, BqU, c6m);
                bLd.A00.A02(0, bly);
                bLd.A01 = false;
                AnonymousClass1F9 r2 = this.A00;
                C26622D6q d6q = new C26622D6q(e8r, bly.A04);
                bly.A0A(r2, d6q);
                C26622D6q d6q2 = bly.A01;
                if (d6q2 != null) {
                    bly.A0D(d6q2);
                }
                bly.A00 = r2;
                bly.A01 = d6q;
                return;
            }
            throw AnonymousClass8BX.A0V(BqU, "Object returned from onCreateLoader must not be a non-static inner member class: ", AnonymousClass000.A10());
        } catch (Throwable th) {
            this.A01.A01 = false;
            throw th;
        }
    }

    public void A02(Bundle bundle, E8R e8r) {
        C24494C6m c6m;
        C22700BLd bLd = this.A01;
        if (bLd.A01) {
            throw AnonymousClass000.A0n("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            BLY bly = (BLY) AnonymousClass0LW.A00(bLd.A00, 0);
            if (bly != null) {
                c6m = bly.A0G(false);
            } else {
                c6m = null;
            }
            A01(bundle, e8r, c6m);
        } else {
            throw AnonymousClass000.A0n("restartLoader must be called on the main thread");
        }
    }

    public void A03(E8R e8r) {
        C22700BLd bLd = this.A01;
        if (bLd.A01) {
            throw AnonymousClass000.A0n("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            BLY bly = (BLY) AnonymousClass0LW.A00(bLd.A00, 0);
            if (bly == null) {
                A01((Bundle) null, e8r, (C24494C6m) null);
                return;
            }
            AnonymousClass1F9 r2 = this.A00;
            C26622D6q d6q = new C26622D6q(e8r, bly.A04);
            bly.A0A(r2, d6q);
            C26622D6q d6q2 = bly.A01;
            if (d6q2 != null) {
                bly.A0D(d6q2);
            }
            bly.A00 = r2;
            bly.A01 = d6q;
        } else {
            throw AnonymousClass000.A0n("initLoader must be called on the main thread");
        }
    }

    @Deprecated
    public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AnonymousClass04B r5 = this.A01.A00;
        if (r5.A00 > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String A0y = AnonymousClass000.A0y("    ", AnonymousClass000.A11(str));
            for (int i = 0; i < r5.A00; i++) {
                BLY bly = (BLY) r5.A02[i];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r5.A01[i]);
                printWriter.print(": ");
                printWriter.println(bly.toString());
                printWriter.print(A0y);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println(bly.A03);
                printWriter.print(A0y);
                printWriter.print("mLoader=");
                C24494C6m c6m = bly.A04;
                printWriter.println(c6m);
                c6m.A05(AnonymousClass000.A0y("  ", AnonymousClass000.A11(A0y)), fileDescriptor, printWriter, strArr);
                if (bly.A01 != null) {
                    printWriter.print(A0y);
                    printWriter.print("mCallbacks=");
                    printWriter.println(bly.A01);
                    C26622D6q d6q = bly.A01;
                    printWriter.print(C17900vP.A0A(A0y, "  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(d6q.A00);
                }
                printWriter.print(A0y);
                printWriter.print("mData=");
                Object A06 = bly.A06();
                StringBuilder A0t = BE6.A0t(64);
                C7M.A00(A06, A0t);
                printWriter.println(AnonymousClass000.A0y("}", A0t));
                printWriter.print(A0y);
                printWriter.print("mStarted=");
                printWriter.println(AnonymousClass000.A1R(bly.A00));
            }
        }
    }

    public String toString() {
        StringBuilder A0t = BE6.A0t(128);
        BEA.A1K(this, "LoaderManager{", A0t);
        A0t.append(" in ");
        C7M.A00(this.A00, A0t);
        return AnonymousClass000.A0y("}}", A0t);
    }

    public C26144Ct7(AnonymousClass1F9 r4, C24081Iu r5) {
        this.A00 = r4;
        C24051Ir r2 = C22700BLd.A02;
        C18070vi.A0d(r5, 1);
        this.A01 = (C22700BLd) new C24071It(r2, r5, C24111Ix.A00).A00(C22700BLd.class);
    }

    public C26144Ct7() {
    }
}
