package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BwC  reason: case insensitive filesystem */
public class C24146BwC extends A34 {
    public final int A00;
    public final C42621yT A01;
    public final AnonymousClass190 A02;
    public final C25311Ns A03;
    public final AnonymousClass121 A04;
    public final AnonymousClass1ST A05;
    public final AnonymousClass18K A06;
    public final C25291Nq A07;
    public final File A08;
    public final WeakReference A09 = AnonymousClass3MW.A0z((Object) null);

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.1yT] */
    public C24146BwC(AnonymousClass190 r7, C25311Ns r8, AnonymousClass121 r9, AnonymousClass1ST r10, AnonymousClass18K r11, C25291Nq r12, AnonymousClass10I r13, File file, int i) {
        this.A02 = r7;
        this.A06 = r11;
        this.A07 = r12;
        this.A00 = i;
        this.A04 = r9;
        this.A05 = r10;
        this.A03 = r8;
        this.A08 = file;
        C18070vi.A0d(r13, 0);
        ? obj = new Object();
        r13.CGv(new AnonymousClass7RJ(obj, 10), 20000);
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.ClI, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ? obj = new Object();
        int i = this.A00;
        obj.A00 = i;
        C25291Nq r27 = this.A07;
        AnonymousClass121 r26 = this.A04;
        AnonymousClass1ST r15 = this.A05;
        C25311Ns r14 = this.A03;
        File file = this.A08;
        C42621yT r12 = this.A01;
        ArrayList A13 = AnonymousClass000.A13();
        try {
            obj.A0C = Long.valueOf(SystemClock.uptimeMillis());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                ArrayList A0z = C17880vN.A0z(r3);
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        A0z.add(new COU(file2));
                    }
                }
                DUR.A00(15, A0z);
                obj.A07 += (long) A0z.size();
                obj.A0B = Long.valueOf(SystemClock.uptimeMillis());
                obj.A0A = Long.valueOf(SystemClock.uptimeMillis());
                C001100p r5 = new C001100p();
                Iterator it = A0z.iterator();
                while (it.hasNext()) {
                    COU cou = (COU) it.next();
                    long j = cou.A00;
                    COV cov = (COV) r5.A05(j);
                    if (cov == null) {
                        cov = new COV(j);
                        r5.A0A(j, cov);
                    }
                    File file3 = cou.A01;
                    List list = cov.A01;
                    boolean z = true;
                    if (!list.isEmpty() && file3.getName().compareTo(((File) list.get(AnonymousClass3MX.A02(list, 1))).getName()) < 0) {
                        z = false;
                    }
                    C17960vV.A0D(z);
                    list.add(file3);
                }
                r12.A02();
                ArrayList A132 = AnonymousClass000.A13();
                for (int i2 = 0; i2 < r5.A00(); i2++) {
                    COV cov2 = (COV) r5.A04(i2);
                    if (cov2.A01.size() >= 2) {
                        A132.add(cov2);
                        obj.A08 += (long) cov2.A01.size();
                    }
                }
                r12.A02();
                DUR.A00(16, A132);
                r12.A02();
                Iterator it2 = A132.iterator();
                while (it2.hasNext()) {
                    COV cov3 = (COV) it2.next();
                    HashMap A11 = C17880vN.A11();
                    List list2 = cov3.A01;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            File file4 = (File) list2.get(size);
                            try {
                                r12.A02();
                                String A002 = C1402370n.A00(file4);
                                long j2 = cov3.A00;
                                obj.A04++;
                                obj.A01 += j2;
                                File file5 = (File) A11.get(A002);
                                if (file5 == null) {
                                    A11.put(A002, file4);
                                } else {
                                    file4.getParentFile();
                                    file4.getName();
                                    file5.getName();
                                    ArrayList A0C = r15.A0C(r12, file4, A002);
                                    r12.A02();
                                    if (!A0C.isEmpty()) {
                                        ArrayList A0g = C108975cc.A0g(A0C);
                                        r14.A06(file5, A0C.size(), true);
                                        Iterator it3 = A0C.iterator();
                                        while (it3.hasNext()) {
                                            AnonymousClass21V r3 = (AnonymousClass21V) it3.next();
                                            C62572rc r0 = r3.A02;
                                            C17960vV.A07(r0);
                                            r0.A0G = file5;
                                            r26.CQw(r3);
                                            A0g.add(new COW(file4, file5));
                                        }
                                        r14.A05(file4, i, A0C.size(), false, false);
                                        A0C.size();
                                        A13.addAll(A0g);
                                        long length = file5.length();
                                        obj.A06++;
                                        obj.A03 += length;
                                    } else {
                                        r27.A0B(file4, i);
                                        file4.delete();
                                        long length2 = file5.length();
                                        obj.A05++;
                                        obj.A02 += length2;
                                    }
                                }
                            } catch (IOException e) {
                                Log.e("mediafilemerger/processfileswithsamelength", e);
                            }
                        }
                    }
                }
            }
        } catch (AnonymousClass1QC e2) {
            Log.e("mediafilemerger/cancelled", e2);
        } catch (Throwable th) {
            SystemClock.uptimeMillis();
            throw th;
        }
        obj.A09 = Long.valueOf(SystemClock.uptimeMillis());
        return new COX(obj, A13);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        COX cox = (COX) obj;
        AnonymousClass1TI r0 = (AnonymousClass1TI) this.A09.get();
        if (r0 != null) {
            r0.accept(cox);
        }
        this.A06.CC7(cox.A00.A01());
    }
}
