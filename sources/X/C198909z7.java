package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9z7  reason: invalid class name and case insensitive filesystem */
public final class C198909z7 {
    public static final C198909z7 A00 = new Object();
    public static final C18100vl A01 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, C22048Awo.A00);

    public final C201110w A00(C18030ve r6) {
        C18070vi.A0d(r6, 0);
        C183669Zd r4 = new C183669Zd(VersionedCapability.Facetracker, 14021);
        C183669Zd r3 = new C183669Zd(VersionedCapability.FaceExpressionFitting, 126020);
        boolean A05 = C18020vd.A05(C18040vf.A01, r6, 11940);
        VersionedCapability versionedCapability = VersionedCapability.Segmentation;
        int i = 1014000;
        if (A05) {
            i = 1019002;
        }
        AnonymousClass1IX of = AnonymousClass1IX.of(r4, r3, new C183669Zd(versionedCapability, i));
        C18070vi.A0X(of);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(of));
        Iterator it = of.iterator();
        while (it.hasNext()) {
            C183669Zd r0 = (C183669Zd) it.next();
            C17880vN.A1P(r0.A01, linkedHashMap, r0.A00);
        }
        C201110w copyOf = C201110w.copyOf((Map) linkedHashMap);
        C18070vi.A0X(copyOf);
        return copyOf;
    }
}
