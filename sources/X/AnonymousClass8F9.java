package X;

import android.app.Application;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.8F9  reason: invalid class name */
public class AnonymousClass8F9 extends AnonymousClass8FK implements AnonymousClass0t0, C22419B7b {
    public int A00;
    public C183119Wz A01 = new C183119Wz(this);
    public AF0 A02;
    public Runnable A03;
    public final Handler A04;
    public final C22801Dg A05;
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final C37361pP A07;
    public final C189319it A08;
    public final AnonymousClass0I4 A09;
    public final AnonymousClass0IX A0A;
    public final C20528AOn A0B;
    public final A07 A0C;
    public final C18030ve A0D;
    public final A17 A0E;
    public final C19989A2b A0F;
    public final C41731wy A0G;
    public final String A0H;
    public final LinkedList A0I;
    public final AnonymousClass1KB A0J;
    public final C19989A2b A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8F9(Application application, C37361pP r13, AnonymousClass9VL r14, C189319it r15, AnonymousClass1KB r16, AnonymousClass0I4 r17, AnonymousClass0IX r18, A07 a07, C18030ve r20, A17 a17, String str, int i) {
        super(application);
        int i2 = i;
        C22801Dg A0R = C108945cZ.A0R();
        this.A05 = A0R;
        this.A0D = r20;
        this.A0J = r16;
        String str2 = str;
        this.A0H = str2;
        this.A07 = r13;
        AnonymousClass0IX r4 = r18;
        this.A0A = r4;
        this.A0C = a07;
        this.A04 = new Handler();
        this.A0I = AnonymousClass8BR.A14();
        this.A0G = AnonymousClass3MW.A0o();
        this.A0E = a17;
        AnonymousClass10E r0 = r14.A00.A02;
        C18030ve A8r = AnonymousClass10E.A8r(r0);
        AnonymousClass10G r1 = r0.A00;
        C20528AOn aOn = new C20528AOn((AnonymousClass0I4) r1.A0a.get(), (C183109Wy) r1.A0Y.get(), A8r, (A17) r1.A0Z.get(), str2);
        this.A0B = aOn;
        this.A09 = r17;
        C20335AGr.A01(aOn.A00, A0R, this, 1);
        r4.A02 = this;
        r4.A00 = aOn;
        if (!C18020vd.A05(C18040vf.A02, this.A0D, 2806)) {
            i2 = 2;
        } else {
            C37361pP r2 = this.A07;
            if (r2.A03.containsKey("arg_home_view_state")) {
                i2 = AnonymousClass000.A0M(r2.A02("arg_home_view_state"));
            }
        }
        this.A00 = i2;
        this.A08 = r15;
        C19989A2b A002 = r15.A00(741488182);
        this.A0F = A002;
        this.A0K = r15.A00(741481818);
        A002.A02();
        A00();
    }

    public static void A03(AnonymousClass8F9 r3, List list) {
        if (r3.A00 == 1) {
            if (C18020vd.A05(C18040vf.A02, r3.A0D, 2806)) {
                list.add(0, new C174168wL(r3.A01));
            }
        }
        r3.A05.A0E(list);
    }

    public void A0S() {
        AnonymousClass0IX r1 = this.A0A;
        r1.A02 = null;
        r1.A00 = null;
        r1.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r3 = r7.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(java.lang.String r8) {
        /*
            r7 = this;
            X.A2b r0 = r7.A0K
            r0.A02()
            java.util.LinkedList r4 = r7.A0I
            monitor-enter(r4)
            java.lang.String r5 = r8.trim()     // Catch:{ all -> 0x0089 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0089 }
            if (r6 != 0) goto L_0x0029
            X.0I4 r1 = r7.A09     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r7.A0H     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0029
            X.A17 r3 = r7.A0E     // Catch:{ all -> 0x0089 }
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0089 }
            r2 = 3
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()     // Catch:{ all -> 0x0089 }
            if (r0 != r2) goto L_0x002d
        L_0x0029:
            r4.add(r5)     // Catch:{ all -> 0x0089 }
            goto L_0x003c
        L_0x002d:
            X.8rz r1 = new X.8rz     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0089 }
            r1.A01 = r0     // Catch:{ all -> 0x0089 }
            X.A17.A00(r1, r3)     // Catch:{ all -> 0x0089 }
            goto L_0x0029
        L_0x003c:
            if (r6 == 0) goto L_0x004e
            r4.clear()     // Catch:{ all -> 0x004c }
            android.os.Handler r1 = r7.A04     // Catch:{ all -> 0x004c }
            java.lang.Runnable r0 = r7.A03     // Catch:{ all -> 0x004c }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x004c }
            r7.A00()     // Catch:{ all -> 0x004c }
            goto L_0x0087
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x004e:
            int r1 = r5.length()     // Catch:{ all -> 0x0089 }
            r0 = 2
            if (r1 < r0) goto L_0x0087
            android.os.Handler r3 = r7.A04     // Catch:{ all -> 0x0089 }
            java.lang.Runnable r2 = r7.A03     // Catch:{ all -> 0x0089 }
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0089 }
            java.lang.Runnable r0 = r7.A03     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0065
            r3.removeCallbacks(r0)     // Catch:{ all -> 0x0089 }
        L_0x0065:
            r0 = 35
            X.AkJ r2 = new X.AkJ     // Catch:{ all -> 0x0089 }
            r2.<init>(r0, r5, r7)     // Catch:{ all -> 0x0089 }
            r7.A03 = r2     // Catch:{ all -> 0x0089 }
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0089 }
            X.1Dg r3 = r7.A05     // Catch:{ all -> 0x0089 }
            r0 = 1
            X.8we[] r2 = new X.C174358we[r0]     // Catch:{ all -> 0x0089 }
            X.8w4 r1 = new X.8w4     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r0 = X.C220618l.newArrayList((java.lang.Object[]) r2)     // Catch:{ all -> 0x0089 }
            r3.A0E(r0)     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8F9.A0T(java.lang.String):void");
    }

    public void C42(C174058wA r2) {
        if (r2 instanceof C169008kC) {
            A0T(((C169008kC) r2).A00);
        } else if (r2 instanceof C168998kB) {
            A00();
        }
    }

    public void C4i(int i, String str) {
        this.A0J.A0J(new C21454AkL(this, str, i, 1));
        this.A0K.A00();
    }

    public void C4l(List list, String str) {
        ArrayList A13;
        C22801Dg r6;
        LinkedList linkedList = this.A0I;
        synchronized (linkedList) {
            if (linkedList.contains(str)) {
                while (!str.equals(linkedList.peek())) {
                    linkedList.poll();
                }
                linkedList.poll();
                if (list.isEmpty()) {
                    r6 = this.A05;
                    A13 = C220618l.newArrayList((Object[]) new C174358we[]{new C169008kC((C22419B7b) null, str, 1)});
                } else {
                    A13 = AnonymousClass000.A13();
                    for (int i = 0; i < list.size(); i++) {
                        AF0 af0 = (AF0) list.get(i);
                        A13.add(new C174098wE(af0, new AWO(this, af0, i), 62));
                    }
                    Application application = this.A00;
                    C18070vi.A0z(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                    A13.add(new C174228wR(C62762rw.A01(application, 12.0f)));
                    A13.add(new C173888vt());
                    A13.add(new C173918vw());
                    r6 = this.A05;
                }
                r6.A0E(A13);
                this.A0K.A01();
                A17 a17 = this.A0E;
                long size = (long) list.size();
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((AF0) it.next()).A08 == 2) {
                        i2++;
                    }
                }
                a17.A02(size, 0, (long) i2);
                if (this.A09.A00(this.A0H)) {
                    long size2 = (long) list.size();
                    Iterator it2 = list.iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        if (((AF0) it2.next()).A08 == 2) {
                            i3++;
                        }
                    }
                    a17.A02(size2, 0, (long) i3);
                }
            }
        }
    }

    private void A00() {
        int length;
        JSONArray optJSONArray;
        LinkedList A14 = AnonymousClass8BR.A14();
        C18030ve r6 = this.A0B.A04;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r6, 2948) || C18020vd.A05(r5, r6, 2270) || !((optJSONArray = r6.A0J(4313).optJSONArray("featured_categories_modules")) == null || optJSONArray.length() == 0)) {
            ArrayList A13 = AnonymousClass000.A13();
            if (C18020vd.A05(r5, r6, 2948)) {
                A13.add(new C174358we(55));
                A13.add(new C173898vu());
            }
            JSONArray optJSONArray2 = r6.A0J(4313).optJSONArray("featured_categories_modules");
            if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                int i = 0;
                while (true) {
                    JSONArray optJSONArray3 = r6.A0J(4313).optJSONArray("featured_categories_modules");
                    if (optJSONArray3 == null) {
                        length = 0;
                    } else {
                        length = optJSONArray3.length();
                    }
                    if (i >= length) {
                        break;
                    }
                    A13.add(new C174358we(55));
                    A13.add(new C173898vu());
                    i++;
                }
            }
            if (C18020vd.A05(r5, r6, 2270)) {
                A13.add(new C174358we(55));
                A13.add(new C173998w4());
            }
            A03(this, A13);
            AnonymousClass0IX r1 = this.A0A;
            C19989A2b A002 = this.A08.A00(741488182);
            r1.A00();
            C15910rP r2 = r1.A05;
            C191659mx r10 = r1.A06.A00;
            AnonymousClass0YV r9 = new AnonymousClass0YV(r1, 0);
            AnonymousClass10E r22 = ((C20527AOm) r2).A00.A00;
            AnonymousClass190 A0N = AnonymousClass3MY.A0N(r22);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r22);
            C18000vb A6Q = AnonymousClass10E.A6Q(r22);
            AnonymousClass0CF r23 = new AnonymousClass0CF(A0N, AnonymousClass8BT.A0B(r22), AnonymousClass3MZ.A0l(r22), AnonymousClass8BU.A0F(r22), A6Q, AnonymousClass10E.A8r(r22), r9, r10, A002, (C183279Xq) r22.A00.A1B.get(), AL1);
            r23.A0E();
            r1.A03 = r23;
            return;
        }
        if (this.A09.A00(this.A0H)) {
            A17 a17 = this.A0E;
            C171608rz r12 = new C171608rz();
            r12.A01 = C17880vN.A0h();
            A17.A00(r12, a17);
        }
        A14.add(new C173908vv());
        A14.add(new C173918vw());
        this.A05.A0E(A14);
    }
}
