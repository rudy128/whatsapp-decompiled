package X;

import com.google.firebase.components.Qualified$Unqualified;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0wE  reason: invalid class name and case insensitive filesystem */
public class C18340wE {
    public int A00;
    public int A01;
    public C18360wH A02;
    public String A03 = null;
    public final Set A04;
    public final Set A05;
    public final Set A06;

    public C18330wD A00() {
        boolean z = false;
        if (this.A02 != null) {
            z = true;
        }
        if (z) {
            return new C18330wD(this.A02, this.A03, new HashSet(this.A05), new HashSet(this.A04), this.A06, this.A00, this.A01);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void A01(C18490wW r3) {
        if (!this.A05.contains(r3.A02)) {
            this.A04.add(r3);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C18340wE(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.A05 = hashSet;
        this.A04 = new HashSet();
        int i = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A06 = new HashSet();
        Class<Qualified$Unqualified> cls2 = Qualified$Unqualified.class;
        hashSet.add(new C18350wG(cls2, cls));
        int length = clsArr.length;
        while (i < length) {
            Class cls3 = clsArr[i];
            if (cls3 != null) {
                this.A05.add(new C18350wG(cls2, cls3));
                i++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
    }

    public C18340wE(C18350wG r5, C18350wG... r6) {
        HashSet hashSet = new HashSet();
        this.A05 = hashSet;
        this.A04 = new HashSet();
        int i = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A06 = new HashSet();
        hashSet.add(r5);
        int length = r6.length;
        while (i < length) {
            if (r6[i] != null) {
                i++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(this.A05, r6);
    }
}
