package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0xc  reason: invalid class name and case insensitive filesystem */
public final class C19070xc implements C18140vp {
    public final C18140vp A00;

    public /* bridge */ /* synthetic */ Object get() {
        C19130xi r5 = (C19130xi) this.A00.get();
        HashMap hashMap = new HashMap();
        C19300xz r8 = C19300xz.DEFAULT;
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            throw new NullPointerException("Null flags");
        } else if ("".isEmpty()) {
            hashMap.put(r8, new C19320y1(emptySet, C20113A7w.A0L));
            C19300xz r82 = C19300xz.HIGHEST;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                hashMap.put(r82, new C19320y1(emptySet2, 1000));
                C19300xz r7 = C19300xz.VERY_LOW;
                if (Collections.emptySet() != null) {
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C19330y2[]{C19330y2.DEVICE_IDLE})));
                    if (unmodifiableSet != null) {
                        hashMap.put(r7, new C19320y1(unmodifiableSet, 86400000));
                        if (r5 == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= C19300xz.values().length) {
                            return new C19350y4(r5, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Missing required properties:");
            sb.append("");
            throw new IllegalStateException(sb.toString());
        }
    }

    public C19070xc(C18140vp r1) {
        this.A00 = r1;
    }
}
