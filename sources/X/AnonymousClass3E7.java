package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3E7  reason: invalid class name */
public final class AnonymousClass3E7 implements AnonymousClass1OG {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03;
    public final AnonymousClass3JS A00;
    public volatile /* synthetic */ Object _exceptionsHolder$volatile;
    public volatile /* synthetic */ int _isCompleting$volatile = 0;
    public volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Class<AnonymousClass3E7> cls = AnonymousClass3E7.class;
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting$volatile");
        Class<Object> cls2 = Object.class;
        A03 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause$volatile");
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder$volatile");
    }

    public AnonymousClass3E7(Throwable th, AnonymousClass3JS r3) {
        this.A00 = r3;
        this._rootCause$volatile = th;
    }

    public static final ArrayList A01() {
        return C17880vN.A0z(4);
    }

    public final void A08() {
        A01.set(this, 1);
    }

    private final Object A00() {
        return A02.get(this);
    }

    private final void A05(Object obj) {
        A02.set(this, obj);
    }

    public final Throwable A06() {
        return (Throwable) A03.get(this);
    }

    public final ArrayList A07(Throwable th) {
        ArrayList arrayList;
        Object A002 = A00();
        if (A002 == null) {
            arrayList = A01();
        } else if (A002 instanceof Throwable) {
            arrayList = A01();
            arrayList.add(A002);
        } else if (A002 instanceof ArrayList) {
            arrayList = (ArrayList) A002;
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1E(A002, "State is ", AnonymousClass000.A10()));
        }
        Throwable A06 = A06();
        if (A06 != null) {
            arrayList.add(0, A06);
        }
        if (th != null && !th.equals(A06)) {
            arrayList.add(th);
        }
        A05(AnonymousClass1OF.A05);
        return arrayList;
    }

    public final void A09(Throwable th) {
        Throwable A06 = A06();
        if (A06 == null) {
            A0A(th);
        } else if (th != A06) {
            Object A002 = A00();
            if (A002 == null) {
                A05(th);
            } else if (A002 instanceof Throwable) {
                if (th != A002) {
                    ArrayList A012 = A01();
                    A012.add(A002);
                    A012.add(th);
                    A05(A012);
                }
            } else if (A002 instanceof ArrayList) {
                ((AbstractCollection) A002).add(th);
            } else {
                throw AnonymousClass000.A0n(AnonymousClass001.A1E(A002, "State is ", AnonymousClass000.A10()));
            }
        }
    }

    public final void A0A(Throwable th) {
        A03.set(this, th);
    }

    public final boolean A0B() {
        return AnonymousClass000.A1W(A06());
    }

    public final boolean A0C() {
        return AnonymousClass000.A1O(A01.get(this));
    }

    public final boolean A0D() {
        return AnonymousClass000.A1Z(A00(), AnonymousClass1OF.A05);
    }

    public AnonymousClass3JS BU1() {
        return this.A00;
    }

    public boolean Be2() {
        return AnonymousClass000.A1X(A06());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Finishing[cancelling=");
        A10.append(A0B());
        A10.append(", completing=");
        A10.append(A0C());
        A10.append(", rootCause=");
        A10.append(A06());
        A10.append(", exceptions=");
        A10.append(A00());
        A10.append(", list=");
        return C17900vP.A09(BU1(), A10);
    }
}
