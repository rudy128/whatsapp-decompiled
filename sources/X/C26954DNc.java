package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.DNc  reason: case insensitive filesystem */
public final class C26954DNc implements E9W {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final C26955DNd A05 = new Object();
    public final C25681CkC A06;

    public Integer BkN() {
        C24286Byj byj;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A03;
        Stack stack2 = this.A04;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = ((C24286Byj) stack.peek()).ordinal();
        if (ordinal == 0) {
            this.A00 = AnonymousClass00R.A0C;
            stack.pop();
            byj = C24286Byj.ObjectReadName;
            stack.push(byj);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                stack.pop();
                stack.push(C24286Byj.ObjectReadName);
            } else if (ordinal == 3) {
                this.A00 = AnonymousClass00R.A00;
                stack.pop();
                byj = C24286Byj.ArrayReadValue;
                stack.push(byj);
            } else if (ordinal == 4) {
                this.A01 = null;
                if (it.hasNext()) {
                    this.A01 = it.next();
                } else {
                    this.A00 = AnonymousClass00R.A01;
                    stack2.pop();
                    stack.pop();
                }
            }
            Object obj = this.A01;
            if (obj == null) {
                num = AnonymousClass00R.A19;
            } else if (obj instanceof Boolean) {
                num = AnonymousClass00R.A18;
            } else if (obj instanceof Number) {
                num = AnonymousClass00R.A15;
            } else if (obj instanceof C25488Cgj) {
                num = AnonymousClass00R.A0u;
            } else if (obj instanceof String) {
                num = AnonymousClass00R.A0j;
            } else if (obj instanceof List) {
                stack2.push(AnonymousClass8BR.A13(obj));
                stack.push(C24286Byj.ArrayReadValue);
                num = AnonymousClass00R.A00;
            } else if (obj instanceof Map) {
                stack2.push(AnonymousClass000.A15((Map) obj));
                stack.push(C24286Byj.ObjectReadName);
                num = AnonymousClass00R.A0C;
            } else {
                throw BEA.A0c(obj, "unknown value type", AnonymousClass000.A10());
            }
            this.A00 = num;
        } else {
            this.A01 = null;
            if (it.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(it);
                this.A02 = C17880vN.A0x(A16);
                this.A01 = A16.getValue();
                this.A00 = AnonymousClass00R.A0Y;
                stack.pop();
                byj = C24286Byj.ObjectReadValue;
                stack.push(byj);
            } else {
                this.A00 = AnonymousClass00R.A0N;
                stack.pop();
                stack2.pop();
            }
        }
        return this.A00;
    }

    public String CBN() {
        return this.A02;
    }

    public Integer CBO() {
        return this.A00;
    }

    public C28595E9m CBP() {
        C26955DNd dNd = this.A05;
        dNd.A00 = this.A01;
        return dNd;
    }

    public void CNS() {
        Integer num = this.A00;
        Integer num2 = AnonymousClass00R.A00;
        if (num == num2 || num == AnonymousClass00R.A0C) {
            int i = 1;
            while (true) {
                Integer BkN = BkN();
                if (BkN == num2 || BkN == AnonymousClass00R.A0C) {
                    i++;
                } else if (BkN == AnonymousClass00R.A01 || BkN == AnonymousClass00R.A0N) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.DNd] */
    public C26954DNc(C25681CkC ckC, Iterator it) {
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        this.A06 = ckC;
        stack.add(it);
        stack2.add(C24286Byj.ReadObject);
    }
}
