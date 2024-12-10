package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

public final class DU6 implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;

    public DU6(AlgorithmParameterSpec algorithmParameterSpec) {
        this.A00 = algorithmParameterSpec;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Dwv, java.lang.Object] */
    public Object run() {
        Method method = C25455Cg7.A01;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        int A0M = AnonymousClass000.A0M(C25455Cg7.A02.invoke(algorithmParameterSpec, new Object[0])) / 8;
        ? obj = new Object();
        obj.A01 = AnonymousClass1C2.A02((byte[]) method.invoke(algorithmParameterSpec, new Object[0]));
        obj.A00 = A0M;
        return obj;
    }
}
