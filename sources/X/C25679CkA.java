package X;

import com.facebook.common.hiddenapis2.ApiExemption;
import com.facebook.common.hiddenapis2.Structs;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import sun.misc.Unsafe;

/* renamed from: X.CkA  reason: case insensitive filesystem */
public class C25679CkA {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Unsafe A04;
    public long A05;
    public boolean A06 = false;

    public static void invoke(Object... objArr) {
        throw AnonymousClass000.A0n("This is a stub, can not call invoke");
    }

    public boolean A00() {
        Unsafe unsafe;
        int i;
        if (this.A06 && (unsafe = this.A04) != null) {
            try {
                Method declaredMethod = C25679CkA.class.getDeclaredMethod("invoke", new Class[]{Object[].class});
                declaredMethod.setAccessible(true);
                long j = unsafe.getLong(VMRuntime.class, this.A03);
                if (j == 0 || (i = unsafe.getInt(j)) == 0) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    unsafe.putLong(declaredMethod, this.A05, (((long) i2) * this.A01) + j + this.A00);
                    if (declaredMethod.getName().equals("setHiddenApiExemptions")) {
                        declaredMethod.invoke(VMRuntime.getRuntime(), new Object[]{ApiExemption.EXEMPTIONS});
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public C25679CkA() {
        boolean z;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke((Object) null, new Object[0]);
            this.A04 = unsafe;
            if (unsafe != null) {
                this.A03 = unsafe.objectFieldOffset(Structs.Class.class.getDeclaredField("methods"));
                this.A05 = this.A04.objectFieldOffset(Structs.Executable.class.getDeclaredField("artMethod"));
                this.A02 = this.A04.objectFieldOffset(Structs.MethodHandle.class.getDeclaredField("artFieldOrMethod"));
                Unsafe unsafe2 = this.A04;
                if (unsafe2 == null) {
                    z = false;
                } else {
                    Class<Structs.Stub> cls = Structs.Stub.class;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("f1", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Method declaredMethod2 = cls.getDeclaredMethod("f2", new Class[0]);
                        declaredMethod2.setAccessible(true);
                        MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
                        MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
                        long j = this.A02;
                        long j2 = unsafe2.getLong(unreflect, j);
                        long j3 = unsafe2.getLong(unreflect2, j);
                        long j4 = unsafe2.getLong(cls, this.A03);
                        long j5 = j3 - j2;
                        this.A01 = j5;
                        this.A00 = (j2 - j4) - j5;
                        z = true;
                    } catch (Throwable unused) {
                        z = false;
                    }
                }
                this.A06 = z;
            }
        } catch (Throwable unused2) {
        }
    }
}
