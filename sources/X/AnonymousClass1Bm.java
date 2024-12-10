package X;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Bm  reason: invalid class name */
public class AnonymousClass1Bm {
    public static Permission A04 = new AnonymousClass1Bn("additionalEcParameters");
    public static Permission A05 = new AnonymousClass1Bn("threadLocalDhDefaultParams");
    public static Permission A06 = new AnonymousClass1Bn("DhDefaultParams");
    public static Permission A07 = new AnonymousClass1Bn("acceptableEcCurves");
    public static Permission A08 = new AnonymousClass1Bn("threadLocalEcImplicitlyCa");
    public static Permission A09 = new AnonymousClass1Bn("ecImplicitlyCa");
    public ThreadLocal A00 = new ThreadLocal();
    public ThreadLocal A01 = new ThreadLocal();
    public volatile Map A02 = new HashMap();
    public volatile Set A03 = new HashSet();
}
