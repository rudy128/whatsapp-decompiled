package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: X.7Au  reason: invalid class name and case insensitive filesystem */
public class C142787Au implements C1604488n {
    public final WebViewProviderFactoryBoundaryInterface A00;

    public StaticsBoundaryInterface BZf() {
        StaticsBoundaryInterface cast;
        Class<StaticsBoundaryInterface> cls = StaticsBoundaryInterface.class;
        InvocationHandler statics = this.A00.getStatics();
        if (statics == null) {
            cast = null;
        } else {
            cast = cls.cast(Proxy.newProxyInstance(AnonymousClass6YL.class.getClassLoader(), new Class[]{cls}, statics));
        }
        return cast;
    }

    public String[] Bbn() {
        return this.A00.getSupportedFeatures();
    }

    public C142787Au(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.A00 = webViewProviderFactoryBoundaryInterface;
    }
}
