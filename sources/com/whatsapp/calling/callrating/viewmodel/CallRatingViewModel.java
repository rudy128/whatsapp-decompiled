package com.whatsapp.calling.callrating.viewmodel;

import X.A4u;
import X.A8A;
import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1VE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C41111vp;
import X.C76053mS;
import X.C84734Kq;
import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public final class CallRatingViewModel extends AnonymousClass1J2 {
    public static final int[] A0F = {2131894879, 2131894880, 2131894881, 2131894882, 2131894883};
    public WamCall A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0M(C76053mS.A00);
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0M(AnonymousClass000.A0h());
    public final AnonymousClass1VE A07;
    public final C84734Kq A08 = new Object();
    public final A4u A09;
    public final A8A A0A;
    public final C18030ve A0B;
    public final C41111vp A0C = AnonymousClass3MW.A0n(-1);
    public final ArrayList A0D = AnonymousClass000.A13();
    public final HashSet A0E = C17880vN.A12();

    public final void A0T(Integer num, boolean z) {
        C18070vi.A0d(num, 0);
        HashSet hashSet = this.A0E;
        Integer valueOf = Integer.valueOf(num.intValue());
        if (z) {
            hashSet.add(valueOf);
        } else {
            hashSet.remove(valueOf);
        }
        AnonymousClass3MY.A1L(this.A06, C17880vN.A1X(hashSet));
    }

    public final boolean A0U(Bundle bundle) {
        WamCall wamCall;
        String str;
        if (C18020vd.A05(C18040vf.A02, this.A0B, 1939)) {
            wamCall = new WamCallExtended();
        } else {
            wamCall = new WamCall();
        }
        Bundle bundle2 = bundle.getBundle("event");
        Class<?> cls = wamCall.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList A13 = AnonymousClass000.A13();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(A13, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(A13, declaredFields);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers)) {
                String name = field.getName();
                C17960vV.A07(bundle2);
                try {
                    field.set(wamCall, bundle2.get(name));
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
        wamCall.newEndCallSurveyVersion = 1L;
        this.A00 = wamCall;
        String A0r = C17880vN.A0r(AnonymousClass1VE.A00(this.A07), "call_rating_last_call");
        WamCall wamCall2 = this.A00;
        if (wamCall2 != null) {
            str = wamCall2.callRandomId;
        } else {
            str = null;
        }
        if (str == null || !str.equals(A0r)) {
            this.A01 = bundle.getString("timeSeriesDir");
            this.A03 = bundle.getBoolean("uploadFieldStat", false);
            WamCall wamCall3 = this.A00;
            if (wamCall3 != null) {
                wamCall3.userRating = 0L;
            }
            return true;
        }
        Log.i("{CallRatingViewModel}/ignore duplicate ratings");
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.4Kq, java.lang.Object] */
    public CallRatingViewModel(AnonymousClass1VE r2, A4u a4u, A8A a8a, C18030ve r5) {
        C18070vi.A0s(r5, a8a, a4u, r2);
        this.A0B = r5;
        this.A0A = a8a;
        this.A09 = a4u;
        this.A07 = r2;
    }
}
