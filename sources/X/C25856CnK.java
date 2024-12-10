package X;

import com.google.protobuf.UnsafeUtil;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.CnK  reason: case insensitive filesystem */
public abstract class C25856CnK {
    public Unsafe A00;

    public static Object A00(Object obj, long j) {
        return UnsafeUtil.A02.A00.getObject(obj, j);
    }

    public byte A01(long j) {
        if (this instanceof C23664BnX) {
            throw C17880vN.A0y();
        }
        throw C17880vN.A0y();
    }

    public byte A02(Object obj, long j) {
        boolean z = this instanceof C23664BnX;
        boolean z2 = UnsafeUtil.A09;
        if (z) {
            if (!z2) {
                return (byte) (BEA.A06(j, UnsafeUtil.A02.A00.getInt(obj, -4 & j)) & 255);
            }
        } else if (!z2) {
            return (byte) (BEA.A06(j, UnsafeUtil.A02.A00.getInt(obj, -4 & j)) & 255);
        }
        return (byte) (BEA.A06(j ^ -1, UnsafeUtil.A02.A06(obj, -4 & j)) & 255);
    }

    public double A03(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A04(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A05(Class cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A06(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A07(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final long A08(Field field) {
        return this.A00.objectFieldOffset(field);
    }

    public final Object A09(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A0A(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public void A0B(Object obj, long j, byte b) {
        boolean z = UnsafeUtil.A09;
        long j2 = j & -4;
        int A06 = UnsafeUtil.A02.A06(obj, j2);
        int i = (int) j;
        if (z) {
            UnsafeUtil.A04(obj, j2, BEB.A03(i ^ -1, A06, b));
        } else {
            UnsafeUtil.A04(obj, j2, BEB.A03(i, A06, b));
        }
    }

    public final void A0E(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0F(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0G(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0H(Object obj, long j, boolean z) {
        boolean z2 = UnsafeUtil.A09;
        byte b = z ? (byte) 1 : 0;
        long j2 = j & -4;
        int A06 = UnsafeUtil.A02.A06(obj, j2);
        int i = (int) j;
        if (z2) {
            UnsafeUtil.A04(obj, j2, BEB.A03(i ^ -1, A06, b));
        } else {
            UnsafeUtil.A04(obj, j2, BEB.A03(i, A06, b));
        }
    }

    public void A0I(byte[] bArr, long j, long j2) {
        if (this instanceof C23664BnX) {
            throw C17880vN.A0y();
        }
        throw C17880vN.A0y();
    }

    public boolean A0J() {
        try {
            Class<?> cls = this.A00.getClass();
            BEB.A14(cls);
            Class[] clsArr = new Class[2];
            Class<Object> cls2 = Object.class;
            clsArr[0] = cls2;
            Class[] A1Y = BE6.A1Y(BE7.A0U(cls, "getInt", clsArr, 1), 3);
            A1Y[2] = Integer.TYPE;
            cls.getMethod("putInt", A1Y);
            Class[] clsArr2 = new Class[2];
            clsArr2[0] = cls2;
            Class A0U = BE7.A0U(cls, "getLong", clsArr2, 1);
            Class[] A1Y2 = BE6.A1Y(A0U, 3);
            A1Y2[2] = A0U;
            cls.getMethod("putLong", A1Y2);
            cls.getMethod("getObject", BE6.A1Y(A0U, 2));
            Class[] A1Y3 = BE6.A1Y(A0U, 3);
            A1Y3[2] = cls2;
            cls.getMethod("putObject", A1Y3);
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A06(th);
            return false;
        }
    }

    public boolean A0K() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (UnsafeUtil.A01() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A06(th);
            return false;
        }
    }

    public boolean A0L(Object obj, long j) {
        int A06;
        int A062;
        boolean z = this instanceof C23664BnX;
        boolean z2 = UnsafeUtil.A09;
        if (z) {
            long j2 = -4 & j;
            C25856CnK cnK = UnsafeUtil.A02;
            if (z2) {
                A062 = BEA.A06(j ^ -1, cnK.A06(obj, j2));
            } else {
                A062 = BEA.A06(j, cnK.A00.getInt(obj, j2));
            }
            return AnonymousClass000.A1O((byte) (A062 & 255));
        }
        long j3 = -4 & j;
        C25856CnK cnK2 = UnsafeUtil.A02;
        if (z2) {
            A06 = BEA.A06(j ^ -1, cnK2.A06(obj, j3));
        } else {
            A06 = BEA.A06(j, cnK2.A00.getInt(obj, j3));
        }
        return AnonymousClass000.A1O((byte) (A06 & 255));
    }

    public C25856CnK(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A0C(Object obj, long j, double d) {
        A0F(obj, j, Double.doubleToLongBits(d));
    }

    public void A0D(Object obj, long j, float f) {
        A0E(obj, j, Float.floatToIntBits(f));
    }
}
