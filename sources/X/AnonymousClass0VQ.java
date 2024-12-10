package X;

import android.view.ViewGroup;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0VQ  reason: invalid class name */
public final class AnonymousClass0VQ implements AnonymousClass0t2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass0D1 A04;
    public SubcomposeSlotReusePolicy A05;
    public final C06970a9 A06 = C06970a9.A02(new Object[16]);
    public final AnonymousClass0XV A07;
    public final HashMap A08 = new HashMap();
    public final HashMap A09 = new HashMap();
    public final HashMap A0A = new HashMap();
    public final AnonymousClass0XI A0B = new AnonymousClass0XI(this);
    public final AnonymousClass0XQ A0C = new AnonymousClass0XQ(this);
    public final C06640Zc A0D = new C06640Zc((Set) null, (AnonymousClass1Y1) null, 1);
    public final Map A0E = new LinkedHashMap();

    public static final void A09(AnonymousClass0VQ r10, boolean z) {
        Snapshot A022;
        r10.A02 = 0;
        r10.A09.clear();
        C06970a9 r6 = r10.A07.A0R.A00;
        int A002 = C06970a9.A00(r6);
        if (r10.A03 != A002) {
            r10.A03 = A002;
            Snapshot A003 = C04790Ov.A00();
            try {
                A022 = A003.A02();
                for (int i = 0; i < A002; i++) {
                    AnonymousClass0XV r1 = (AnonymousClass0XV) r6.A07().get(i);
                    AnonymousClass0N6 r3 = (AnonymousClass0N6) r10.A08.get(r1);
                    if (r3 != null && AnonymousClass001.A1b(r3.A00)) {
                        C04700Ok r2 = r1.A0Q;
                        AnonymousClass0AK r0 = r2.A0G;
                        Integer num = AnonymousClass00R.A0C;
                        r0.A05 = num;
                        AnonymousClass0AL r02 = r2.A04;
                        if (r02 != null) {
                            r02.A02 = num;
                        }
                        if (z) {
                            C17240uL r03 = r3.A01;
                            if (r03 != null) {
                                r03.deactivate();
                            }
                            r3.A00 = AnonymousClass0Q9.A03(false);
                        } else {
                            AnonymousClass000.A1C(r3.A00, false);
                        }
                        r3.A02 = C04590Nz.A00;
                    }
                }
                AnonymousClass0N4.A00(A022);
                A003.A0D();
                r10.A0A.clear();
            } catch (Throwable th) {
                A003.A0D();
                throw th;
            }
        }
        r10.A0E();
    }

    public final void A0F(int i) {
        Snapshot A022;
        this.A03 = 0;
        AnonymousClass0XV r8 = this.A07;
        C03660Jf r7 = r8.A0R;
        C06970a9 r6 = r7.A00;
        int A002 = (C06970a9.A00(r6) - this.A02) - 1;
        int i2 = i;
        if (i2 <= A002) {
            C06640Zc r3 = this.A0D;
            r3.clear();
            if (i2 <= A002) {
                int i3 = i2;
                while (true) {
                    r3.A00(A04(i3));
                    if (i3 == A002) {
                        break;
                    }
                    i3++;
                }
            }
            this.A05.BZP(r3);
            Snapshot A003 = C04790Ov.A00();
            try {
                A022 = A003.A02();
                boolean z = false;
                while (A002 >= i2) {
                    AnonymousClass0XV r1 = (AnonymousClass0XV) r6.A07().get(A002);
                    HashMap hashMap = this.A08;
                    Object obj = hashMap.get(r1);
                    C18070vi.A0b(obj);
                    AnonymousClass0N6 r13 = (AnonymousClass0N6) obj;
                    Object obj2 = r13.A02;
                    if (r3.contains(obj2)) {
                        this.A03++;
                        if (AnonymousClass001.A1b(r13.A00)) {
                            C04700Ok r12 = r1.A0Q;
                            AnonymousClass0AK r0 = r12.A0G;
                            Integer num = AnonymousClass00R.A0C;
                            r0.A05 = num;
                            AnonymousClass0AL r02 = r12.A04;
                            if (r02 != null) {
                                r02.A02 = num;
                            }
                            AnonymousClass000.A1C(r13.A00, false);
                            z = true;
                        }
                    } else {
                        r8.A0C = true;
                        hashMap.remove(r1);
                        C17240uL r03 = r13.A01;
                        if (r03 != null) {
                            r03.dispose();
                        }
                        int i4 = (A002 + 1) - 1;
                        if (A002 <= i4) {
                            while (true) {
                                AnonymousClass0XV.A0B(r8, (AnonymousClass0XV) r7.A00(i4));
                                if (i4 == A002) {
                                    break;
                                }
                                i4--;
                            }
                        }
                        r8.A0C = false;
                    }
                    this.A0A.remove(obj2);
                    A002--;
                }
                AnonymousClass0N4.A00(A022);
                A003.A0D();
                if (z) {
                    C04790Ov.A03();
                }
            } catch (Throwable th) {
                A003.A0D();
                throw th;
            }
        }
        A0E();
    }

    public void Bqy() {
        A09(this, true);
    }

    public void C46() {
        A09(this, false);
    }

    public static final C17240uL A00(AnonymousClass0D1 r1, C17240uL r2, AnonymousClass0XV r3, AnonymousClass1OS r4, boolean z) {
        if (r2 == null || ((AnonymousClass0VT) r2).A01) {
            ViewGroup.LayoutParams layoutParams = AnonymousClass0O2.A00;
            r2 = new AnonymousClass0VT(new AnonymousClass0VP(r3), r1);
        }
        if (!z) {
            r2.CIT(r4);
            return r2;
        }
        r2.CIX(r4);
        return r2;
    }

    private final AnonymousClass0XV A03(Object obj) {
        int i;
        int i2;
        if (this.A03 == 0) {
            return null;
        }
        AnonymousClass0XV r8 = this.A07;
        C06970a9 r6 = r8.A0R.A00;
        int A002 = C06970a9.A00(r6) - this.A02;
        int i3 = A002 - this.A03;
        int i4 = A002 - 1;
        while (true) {
            if (i < i3) {
                i2 = -1;
                break;
            } else if (C18070vi.A18(A04(i), obj)) {
                i2 = i;
                break;
            } else {
                i4 = i - 1;
            }
        }
        if (i2 == -1) {
            i = A002 - 1;
            while (i >= i3) {
                Object obj2 = this.A08.get(r6.A07().get(i));
                C18070vi.A0b(obj2);
                AnonymousClass0N6 r4 = (AnonymousClass0N6) obj2;
                if (r4.A02 == C04590Nz.A00 || this.A05.BCa(obj, r4.A02)) {
                    r4.A02 = obj;
                    i2 = i;
                } else {
                    i--;
                }
            }
            return null;
        }
        if (i2 == -1) {
            return null;
        }
        if (i != i3) {
            r8.A0C = true;
            r8.A0d(i, i3, 1);
            r8.A0C = false;
        }
        this.A03--;
        AnonymousClass0XV r2 = (AnonymousClass0XV) r6.A07().get(i3);
        Object obj3 = this.A08.get(r2);
        C18070vi.A0b(obj3);
        AnonymousClass0N6 r1 = (AnonymousClass0N6) obj3;
        r1.A00 = AnonymousClass0Q9.A03(true);
        r1.A04 = true;
        r1.A03 = true;
        return r2;
    }

    private final Object A04(int i) {
        Object obj = this.A08.get(this.A07.A0R.A00.A07().get(i));
        C18070vi.A0b(obj);
        return ((AnonymousClass0N6) obj).A02;
    }

    /* access modifiers changed from: private */
    public final List A06(Object obj, AnonymousClass1OS r8) {
        C06970a9 r2 = this.A06;
        int i = r2.A00;
        int i2 = this.A01;
        if (i >= i2) {
            if (i == i2) {
                r2.A0F(obj);
            } else {
                r2.A01[i2] = obj;
            }
            this.A01++;
            HashMap hashMap = this.A09;
            if (!hashMap.containsKey(obj)) {
                this.A0E.put(obj, A0C(obj, r8));
                AnonymousClass0XV r22 = this.A07;
                if (r22.A0Q.A05 == AnonymousClass00R.A0C) {
                    r22.A0j(true);
                } else {
                    r22.A0l(true, true);
                }
            }
            AnonymousClass0XV r0 = (AnonymousClass0XV) hashMap.get(obj);
            if (r0 == null) {
                return AnonymousClass1ZU.A09();
            }
            List A0b = r0.A0Q.A0G.A0b();
            int size = A0b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AnonymousClass0AK) A0b.get(i3)).A0P.A08 = true;
            }
            return A0b;
        }
        throw AnonymousClass000.A0k("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
    }

    public static final void A08(AnonymousClass0VQ r2) {
        C29401cD.A0K(r2.A0E.entrySet(), new C09980hb(r2));
    }

    private final void A0A(AnonymousClass0XV r10, Object obj, AnonymousClass1OS r12) {
        boolean z;
        HashMap hashMap = this.A08;
        Object obj2 = hashMap.get(r10);
        if (obj2 == null) {
            obj2 = new AnonymousClass0N6((C17240uL) null, obj, AnonymousClass0M6.A00(), (AnonymousClass1Y1) null, 4);
            hashMap.put(r10, obj2);
        }
        AnonymousClass0N6 r3 = (AnonymousClass0N6) obj2;
        C17240uL r0 = r3.A01;
        if (r0 != null) {
            AnonymousClass0VT r02 = (AnonymousClass0VT) r0;
            synchronized (r02.A09) {
                z = AnonymousClass000.A1R(r02.A00.A00);
            }
        } else {
            z = true;
        }
        if (r3.A00() != r12 || z || r3.A03) {
            r3.A01(r12);
            A07(r3, r10);
            r3.A03 = false;
        }
    }

    public final C01830Ab A0B(AnonymousClass1OS r2) {
        return new C01830Ab(this, r2);
    }

    public final AnonymousClass0t7 A0C(Object obj, AnonymousClass1OS r8) {
        AnonymousClass0XV r4;
        AnonymousClass0XV r5 = this.A07;
        if (r5.A08 == null) {
            return new AnonymousClass0XO();
        }
        A0E();
        if (!this.A0A.containsKey(obj)) {
            this.A0E.remove(obj);
            HashMap hashMap = this.A09;
            Object obj2 = hashMap.get(obj);
            AnonymousClass0XV r42 = obj2;
            if (obj2 == null) {
                AnonymousClass0XV A032 = A03(obj);
                C03660Jf r0 = r5.A0R;
                if (A032 != null) {
                    C06970a9 r1 = r0.A00;
                    int indexOf = r1.A07().indexOf(A032);
                    int A002 = C06970a9.A00(r1);
                    r5.A0C = true;
                    r5.A0d(indexOf, A002, 1);
                    r4 = A032;
                } else {
                    int A003 = C06970a9.A00(r0.A00);
                    AnonymousClass0XV r43 = new AnonymousClass0XV(true, AnonymousClass0PD.A00.addAndGet(1));
                    r5.A0C = true;
                    r5.A0h(r43, A003);
                    r4 = r43;
                }
                r5.A0C = false;
                this.A02++;
                hashMap.put(obj, r4);
                r42 = r4;
            }
            A0A((AnonymousClass0XV) r42, obj, r8);
        }
        return new AnonymousClass0XP(this, obj);
    }

    public final void A0E() {
        int A002 = C06970a9.A00(this.A07.A0R.A00);
        HashMap hashMap = this.A08;
        if (hashMap.size() == A002) {
            int i = this.A03;
            int i2 = this.A02;
            if ((A002 - i) - i2 >= 0) {
                HashMap hashMap2 = this.A09;
                if (hashMap2.size() != i2) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Incorrect state. Precomposed children ");
                    A10.append(i2);
                    A10.append(". Map size ");
                    A10.append(hashMap2.size());
                    throw AnonymousClass000.A0j(A10);
                }
                return;
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Incorrect state. Total children ");
            A102.append(A002);
            A102.append(". Reusable children ");
            A102.append(i);
            throw AnonymousClass001.A13(". Precomposed children ", A102, i2);
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("Inconsistency between the count of nodes tracked by the state (");
        A103.append(hashMap.size());
        A103.append(") and the children count on the SubcomposeLayout (");
        A103.append(A002);
        throw AnonymousClass001.A12("). Are you trying to use the state of the disposed SubcomposeLayout?", A103);
    }

    public void C2t() {
        AnonymousClass0XV r3 = this.A07;
        r3.A0C = true;
        HashMap hashMap = this.A08;
        for (AnonymousClass0N6 r0 : hashMap.values()) {
            C17240uL r02 = r0.A01;
            if (r02 != null) {
                r02.dispose();
            }
        }
        r3.A0a();
        r3.A0C = false;
        hashMap.clear();
        this.A0A.clear();
        this.A02 = 0;
        this.A03 = 0;
        this.A09.clear();
        A0E();
    }

    public AnonymousClass0VQ(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy, AnonymousClass0XV r5) {
        this.A07 = r5;
        this.A05 = subcomposeSlotReusePolicy;
    }

    private final void A07(AnonymousClass0N6 r10, AnonymousClass0XV r11) {
        Snapshot A022;
        Snapshot A002 = C04790Ov.A00();
        try {
            A022 = A002.A02();
            AnonymousClass0XV r6 = this.A07;
            r6.A0C = true;
            AnonymousClass1OS A003 = r10.A00();
            C17240uL r4 = r10.A01;
            AnonymousClass0D1 r3 = this.A04;
            if (r3 != null) {
                r10.A01 = A00(r3, r4, r11, AnonymousClass0LC.A01(new C13190my(r10, A003), -1750409193, true), r10.A04);
                r10.A04 = false;
                r6.A0C = false;
                AnonymousClass0N4.A00(A022);
                A002.A0D();
                return;
            }
            throw AnonymousClass000.A0n("parent composition reference not set");
        } catch (Throwable th) {
            A002.A0D();
            throw th;
        }
    }

    public final List A0D(Object obj, AnonymousClass1OS r10) {
        AnonymousClass0XV r3;
        A0E();
        AnonymousClass0XV r6 = this.A07;
        Integer num = r6.A0Q.A05;
        Integer num2 = AnonymousClass00R.A00;
        if (num == num2 || num == AnonymousClass00R.A0C || num == AnonymousClass00R.A01 || num == AnonymousClass00R.A0N) {
            HashMap hashMap = this.A0A;
            Object obj2 = hashMap.get(obj);
            AnonymousClass0XV r32 = obj2;
            if (obj2 == null) {
                AnonymousClass0XV r33 = (AnonymousClass0XV) this.A09.remove(obj);
                if (r33 != null) {
                    int i = this.A02;
                    if (i > 0) {
                        this.A02 = i - 1;
                        r3 = r33;
                    } else {
                        throw AnonymousClass000.A0n("Check failed.");
                    }
                } else {
                    AnonymousClass0XV A032 = A03(obj);
                    r3 = A032;
                    if (A032 == null) {
                        int i2 = this.A00;
                        AnonymousClass0XV r34 = new AnonymousClass0XV(true, AnonymousClass0PD.A00.addAndGet(1));
                        r6.A0C = true;
                        r6.A0h(r34, i2);
                        r6.A0C = false;
                        r3 = r34;
                    }
                }
                hashMap.put(obj, r3);
                r32 = r3;
            }
            AnonymousClass0XV r35 = (AnonymousClass0XV) r32;
            C06970a9 r2 = r6.A0R.A00;
            if (C29431cG.A0f(r2.A07(), this.A00) != r35) {
                int indexOf = r2.A07().indexOf(r35);
                int i3 = this.A00;
                if (indexOf < i3) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Key \"");
                    A10.append(obj);
                    throw AnonymousClass001.A12("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.", A10);
                } else if (i3 != indexOf) {
                    r6.A0C = true;
                    r6.A0d(indexOf, i3, 1);
                    r6.A0C = false;
                }
            }
            this.A00++;
            A0A(r35, obj, r10);
            if (num == num2 || num == AnonymousClass00R.A0C) {
                return r35.A0Q.A0G.A0b();
            }
            return r35.A0P();
        }
        throw AnonymousClass000.A0n("subcompose can only be used inside the measure or layout blocks");
    }
}
