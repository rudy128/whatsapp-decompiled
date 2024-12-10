package X;

import java.lang.reflect.Method;

/* renamed from: X.BQq  reason: case insensitive filesystem */
public class C22815BQq extends C25448Cfz {
    public static C22815BQq A05;
    public final Method A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;

    public C22815BQq() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<Class[]> cls;
        Method method5 = null;
        Class<Class> cls2 = Class.class;
        try {
            Class<String> cls3 = String.class;
            method = cls2.getDeclaredMethod("forName", new Class[]{cls3});
            try {
                cls = Class[].class;
                method2 = cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls3, cls});
            } catch (Throwable unused) {
                method2 = null;
                method3 = null;
                method4 = null;
                this.A00 = method;
                this.A04 = method2;
                this.A01 = method3;
                this.A03 = method4;
                this.A02 = method5;
            }
            try {
                method3 = cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls3});
                try {
                    method4 = cls2.getDeclaredMethod("getDeclaredFields", new Class[0]);
                    try {
                        method5 = cls2.getDeclaredMethod("getDeclaredConstructor", new Class[]{cls});
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    method4 = null;
                }
            } catch (Throwable unused4) {
                method3 = null;
                method4 = null;
                this.A00 = method;
                this.A04 = method2;
                this.A01 = method3;
                this.A03 = method4;
                this.A02 = method5;
            }
        } catch (Throwable unused5) {
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            this.A00 = method;
            this.A04 = method2;
            this.A01 = method3;
            this.A03 = method4;
            this.A02 = method5;
        }
        this.A00 = method;
        this.A04 = method2;
        this.A01 = method3;
        this.A03 = method4;
        this.A02 = method5;
    }
}
