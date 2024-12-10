package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Fw  reason: invalid class name and case insensitive filesystem */
public class C23391Fw extends C23381Fv {
    public int A00;
    public AnonymousClass01G A01 = new AnonymousClass01G();
    public C23401Fx A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final WeakReference A06;
    public final AnonymousClass1G4 A07;

    public void A08(C23401Fx r2) {
        C18070vi.A0d(r2, 0);
        A03("setCurrentState");
        A01(r2);
    }

    public static final C23401Fx A00(C218317o r3, C23391Fw r4) {
        C001300r r0;
        C23401Fx r32;
        AnonymousClass1GD r02;
        HashMap hashMap = r4.A01.A00;
        if (hashMap.containsKey(r3)) {
            r0 = ((C001300r) hashMap.get(r3)).A01;
        } else {
            r0 = null;
        }
        C23401Fx r2 = null;
        if (r0 == null || (r02 = (AnonymousClass1GD) r0.getValue()) == null) {
            r32 = null;
        } else {
            r32 = r02.A00;
        }
        ArrayList arrayList = r4.A03;
        if (!arrayList.isEmpty()) {
            r2 = (C23401Fx) arrayList.get(arrayList.size() - 1);
        }
        C23401Fx r1 = r4.A02;
        if (r32 != null && r32.compareTo(r1) < 0) {
            r1 = r32;
        }
        if (r2 == null || r2.compareTo(r1) >= 0) {
            return r1;
        }
        return r2;
    }

    private final void A01(C23401Fx r4) {
        C23401Fx r2 = this.A02;
        if (r2 == r4) {
            return;
        }
        if (r2 == C23401Fx.INITIALIZED && r4 == C23401Fx.DESTROYED) {
            StringBuilder sb = new StringBuilder();
            sb.append("no event down from ");
            sb.append(r2);
            sb.append(" in component ");
            sb.append(this.A06.get());
            throw new IllegalStateException(sb.toString());
        }
        this.A02 = r4;
        if (this.A04 || this.A00 != 0) {
            this.A05 = true;
            return;
        }
        this.A04 = true;
        A02(this);
        this.A04 = false;
        if (this.A02 == C23401Fx.DESTROYED) {
            this.A01 = new AnonymousClass01G();
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.Iterator, X.01O, java.lang.Object] */
    public static final void A02(C23391Fw r8) {
        C27581Wq r0;
        AnonymousClass1F9 r3 = (AnonymousClass1F9) r8.A06.get();
        if (r3 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            AnonymousClass01G r1 = r8.A01;
            boolean z = true;
            if (r1.A00 != 0) {
                C001300r r02 = r1.A02;
                C18070vi.A0b(r02);
                C23401Fx r2 = ((AnonymousClass1GD) r02.getValue()).A00;
                C001300r r03 = r8.A01.A01;
                C18070vi.A0b(r03);
                C23401Fx r12 = ((AnonymousClass1GD) r03.getValue()).A00;
                if (!(r2 == r12 && r8.A02 == r12)) {
                    z = false;
                }
            }
            r8.A05 = false;
            if (!z) {
                C23401Fx r13 = r8.A02;
                C001300r r04 = r8.A01.A02;
                C18070vi.A0b(r04);
                if (r13.compareTo(((AnonymousClass1GD) r04.getValue()).A00) < 0) {
                    AnonymousClass01G r22 = r8.A01;
                    C001300r r14 = r22.A01;
                    C001300r r05 = r22.A02;
                    ? obj = new Object();
                    obj.A00 = r05;
                    obj.A01 = r14;
                    r22.A03.put(obj, false);
                    while (obj.hasNext() && !r8.A05) {
                        Map.Entry entry = (Map.Entry) obj.next();
                        C18070vi.A0V(entry);
                        Object key = entry.getKey();
                        AnonymousClass1GD r4 = (AnonymousClass1GD) entry.getValue();
                        while (r4.A00.compareTo(r8.A02) > 0 && !r8.A05 && r8.A01.A00.containsKey(key)) {
                            C27581Wq A002 = C27591Wr.A00(r4.A00);
                            if (A002 != null) {
                                C23401Fx A003 = A002.A00();
                                ArrayList arrayList = r8.A03;
                                arrayList.add(A003);
                                r4.A00(A002, r3);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("no event down from ");
                                sb.append(r4.A00);
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                    }
                }
                C001300r r23 = r8.A01.A01;
                if (!r8.A05 && r23 != null && r8.A02.compareTo(((AnonymousClass1GD) r23.getValue()).A00) > 0) {
                    AnonymousClass01G r06 = r8.A01;
                    C006702y r7 = new C006702y(r06);
                    r06.A03.put(r7, false);
                    while (r7.hasNext() && !r8.A05) {
                        Map.Entry entry2 = (Map.Entry) r7.next();
                        Object key2 = entry2.getKey();
                        AnonymousClass1GD r5 = (AnonymousClass1GD) entry2.getValue();
                        while (r5.A00.compareTo(r8.A02) < 0 && !r8.A05 && r8.A01.A00.containsKey(key2)) {
                            C23401Fx r42 = r5.A00;
                            ArrayList arrayList2 = r8.A03;
                            arrayList2.add(r42);
                            int ordinal = r42.ordinal();
                            if (ordinal == 2) {
                                r0 = C27581Wq.ON_START;
                            } else if (ordinal == 3) {
                                r0 = C27581Wq.ON_RESUME;
                            } else if (ordinal != 1) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("no event up from ");
                                sb2.append(r42);
                                throw new IllegalStateException(sb2.toString());
                            } else {
                                r0 = C27581Wq.ON_CREATE;
                            }
                            r5.A00(r0, r3);
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                r8.A07.setValue(r8.A02);
                return;
            }
        }
    }

    public void A07(C27581Wq r2) {
        A03("handleLifecycleEvent");
        A01(r2.A00());
    }

    public C23391Fw(AnonymousClass1F9 r3) {
        C23401Fx r1 = C23401Fx.INITIALIZED;
        this.A02 = r1;
        this.A03 = new ArrayList();
        this.A06 = new WeakReference(r3);
        this.A07 = new AnonymousClass1G7(r1);
    }

    public static final void A03(String str) {
        if (!C001600u.A00().A03()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(str);
            sb.append(" must be called on the main thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
