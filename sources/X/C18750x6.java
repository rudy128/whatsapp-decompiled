package X;

import com.google.firebase.components.Qualified$Unqualified;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0x6  reason: invalid class name and case insensitive filesystem */
public final class C18750x6 implements C18400wL {
    public final C18400wL A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;
    public final Set A06;

    public Object BMC(C18350wG r3) {
        if (this.A02.contains(r3)) {
            return this.A00.BMC(r3);
        }
        throw new AnonymousClass3ES(String.format("Attempting to request an undeclared dependency %s.", new Object[]{r3}));
    }

    public Object BMD(Class cls) {
        if (this.A02.contains(new C18350wG(Qualified$Unqualified.class, cls))) {
            Object BMD = this.A00.BMD(cls);
            if (!cls.equals(C18430wO.class)) {
                return BMD;
            }
            return new C65602wo((C18430wO) BMD, this.A04);
        }
        throw new AnonymousClass3ES(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public C18290w6 BXi(C18350wG r3) {
        if (this.A03.contains(r3)) {
            return this.A00.BXi(r3);
        }
        throw new AnonymousClass3ES(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{r3}));
    }

    public C18290w6 BXj(Class cls) {
        return BXi(new C18350wG(Qualified$Unqualified.class, cls));
    }

    public Set CJd(C18350wG r3) {
        if (this.A05.contains(r3)) {
            return this.A00.CJd(r3);
        }
        throw new AnonymousClass3ES(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{r3}));
    }

    public C18750x6(C18330wD r12, C18400wL r13) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C18490wW r8 : r12.A04) {
            int i = r8.A00;
            int i2 = r8.A01;
            boolean z = false;
            if (i == 0) {
                z = i2 == 2 ? true : z;
                C18350wG r0 = r8.A02;
                if (z) {
                    hashSet4.add(r0);
                } else {
                    hashSet.add(r0);
                }
            } else {
                z = i2 == 2 ? true : z;
                C18350wG r02 = r8.A02;
                if (z) {
                    hashSet5.add(r02);
                } else {
                    hashSet2.add(r02);
                }
            }
        }
        Set set = r12.A06;
        if (!set.isEmpty()) {
            hashSet.add(new C18350wG(Qualified$Unqualified.class, C18430wO.class));
        }
        this.A02 = Collections.unmodifiableSet(hashSet);
        this.A03 = Collections.unmodifiableSet(hashSet2);
        this.A01 = Collections.unmodifiableSet(hashSet3);
        this.A05 = Collections.unmodifiableSet(hashSet4);
        this.A06 = Collections.unmodifiableSet(hashSet5);
        this.A04 = set;
        this.A00 = r13;
    }
}
