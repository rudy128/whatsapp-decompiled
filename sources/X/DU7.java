package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

public final class DU7 implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;
    public final /* synthetic */ C27190DYo A01;

    public DU7(AlgorithmParameterSpec algorithmParameterSpec, C27190DYo dYo) {
        this.A01 = dYo;
        this.A00 = algorithmParameterSpec;
    }

    public Object run() {
        C27190DYo dYo = this.A01;
        Method method = C25455Cg7.A02;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        return new DYn(dYo, (byte[]) C25455Cg7.A01.invoke(algorithmParameterSpec, new Object[0]), (byte[]) null, AnonymousClass000.A0M(method.invoke(algorithmParameterSpec, new Object[0])));
    }
}
