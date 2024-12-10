package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.01M  reason: invalid class name */
public final class AnonymousClass01M {
    public final Bundle A00;
    public final List A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final transient Map A06;
    public final /* synthetic */ AnonymousClass01C A07;

    public static final void A01(AnonymousClass01M r2, AnonymousClass02j r3, C005302h r4, C27581Wq r5, String str) {
        C18070vi.A0d(r5, 5);
        if (C27581Wq.ON_START == r5) {
            r2.A06.put(str, new C005602l(r3, r4));
            Map map = r2.A03;
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                map.remove(str);
                r3.Bkx(obj);
            }
            Bundle bundle = r2.A00;
            C005702m r0 = (C005702m) C24141Ja.A00(bundle, C005702m.class, str);
            if (r0 != null) {
                bundle.remove(str);
                r3.Bkx(r4.A05(r0.A01, r0.A00));
            }
        } else if (C27581Wq.ON_STOP == r5) {
            r2.A06.remove(str);
        } else if (C27581Wq.ON_DESTROY == r5) {
            r2.A08(str);
        }
    }

    public final AnonymousClass05q A03(AnonymousClass02j r5, C005302h r6, AnonymousClass1F9 r7, String str) {
        C18070vi.A0d(str, 0);
        C23381Fv lifecycle = r7.getLifecycle();
        if (!lifecycle.A04().A00(C23401Fx.STARTED)) {
            Map map = this.A02;
            if (map.get(str) == null) {
                Integer valueOf = Integer.valueOf(A00());
                this.A04.put(valueOf, str);
                map.put(str, valueOf);
            }
            Map map2 = this.A05;
            C006802z r1 = (C006802z) map2.get(str);
            if (r1 == null) {
                r1 = new C006802z(lifecycle);
            }
            r1.A01(new AnonymousClass030(this, r5, r6, str));
            map2.put(str, r1);
            return new AnonymousClass05q(this, r6, str, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LifecycleOwner ");
        sb.append(r7);
        sb.append(" is attempting to register while current state is ");
        sb.append(lifecycle.A04());
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass05q A04(AnonymousClass02j r4, C005302h r5, String str) {
        C18070vi.A0d(str, 0);
        Map map = this.A02;
        if (map.get(str) == null) {
            Integer valueOf = Integer.valueOf(A00());
            this.A04.put(valueOf, str);
            map.put(str, valueOf);
        }
        this.A06.put(str, new C005602l(r4, r5));
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            r4.Bkx(obj);
        }
        Bundle bundle = this.A00;
        C005702m r0 = (C005702m) C24141Ja.A00(bundle, C005702m.class, str);
        if (r0 != null) {
            bundle.remove(str);
            r4.Bkx(r5.A05(r0.A01, r0.A00));
        }
        return new AnonymousClass05q(this, r5, str, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass01M(AnonymousClass01C r1) {
        this();
        this.A07 = r1;
    }

    private final int A00() {
        Iterator it = AnonymousClass1JO.A02(C005502k.A00).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (!this.A04.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void A05(int i, Object obj) {
        String str = (String) this.A04.get(Integer.valueOf(i));
        if (str != null) {
            C005602l r0 = (C005602l) this.A06.get(str);
            if (r0 != null) {
                AnonymousClass02j r1 = r0.A00;
                C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                if (this.A01.remove(str)) {
                    r1.Bkx(obj);
                    return;
                }
                return;
            }
            this.A00.remove(str);
            this.A03.put(str, obj);
        }
    }

    public final void A06(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                this.A01.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                this.A00.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                Map map = this.A02;
                if (map.containsKey(str)) {
                    Object remove = map.remove(str);
                    if (!this.A00.containsKey(str)) {
                        C41681wt.A03(this.A04).remove(remove);
                    }
                }
                Integer num = integerArrayList.get(i);
                C18070vi.A0X(num);
                int intValue = num.intValue();
                String str2 = stringArrayList.get(i);
                C18070vi.A0X(str2);
                Integer valueOf = Integer.valueOf(intValue);
                this.A04.put(valueOf, str2);
                map.put(str2, valueOf);
            }
        }
    }

    public void A07(C005302h r12, C1406772n r13, Object obj, int i) {
        Bundle bundle;
        AnonymousClass01C r3 = this.A07;
        C03160Gv A042 = r12.A04(r3, obj);
        int i2 = i;
        if (A042 != null) {
            new Handler(Looper.getMainLooper()).post(new AnonymousClass0ZL(this, A042, i));
            return;
        }
        Intent A032 = r12.A03(r3, obj);
        if (A032.getExtras() != null) {
            Bundle extras = A032.getExtras();
            C18070vi.A0b(extras);
            if (extras.getClassLoader() == null) {
                A032.setExtrasClassLoader(r3.getClassLoader());
            }
        }
        if (A032.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = A032.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            A032.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else if (r13 != null) {
            bundle = r13.A03();
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(A032.getAction())) {
            String[] stringArrayExtra = A032.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C110885hR.A0B(r3, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(A032.getAction())) {
            AnonymousClass0RL r0 = (AnonymousClass0RL) A032.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                C18070vi.A0b(r0);
                r3.startIntentSenderForResult(r0.A03, i2, r0.A02, r0.A00, r0.A01, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new AnonymousClass0ZM(e, this, i));
            }
        } else {
            r3.startActivityForResult(A032, i, bundle);
        }
    }

    public final void A08(String str) {
        Object remove;
        if (!this.A01.contains(str) && (remove = this.A02.remove(str)) != null) {
            this.A04.remove(remove);
        }
        this.A06.remove(str);
        Map map = this.A03;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            Log.w("ActivityResultRegistry", sb.toString());
            map.remove(str);
        }
        Bundle bundle = this.A00;
        if (bundle.containsKey(str)) {
            Object A002 = C24141Ja.A00(bundle, C005702m.class, str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(A002);
            Log.w("ActivityResultRegistry", sb2.toString());
            bundle.remove(str);
        }
        Map map2 = this.A05;
        C006802z r0 = (C006802z) map2.get(str);
        if (r0 != null) {
            r0.A00();
            map2.remove(str);
        }
    }

    public final boolean A09(Intent intent, int i, int i2) {
        String str = (String) this.A04.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C005602l r3 = (C005602l) this.A06.get(str);
        if (r3 != null) {
            AnonymousClass02j r2 = r3.A00;
            List list = this.A01;
            if (list.contains(str)) {
                r2.Bkx(r3.A01.A05(intent, i2));
                list.remove(str);
                return true;
            }
        }
        this.A03.remove(str);
        this.A00.putParcelable(str, new C005702m(i2, intent));
        return true;
    }

    public AnonymousClass01M() {
        this.A04 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
        this.A05 = new LinkedHashMap();
        this.A01 = new ArrayList();
        this.A06 = new LinkedHashMap();
        this.A03 = new LinkedHashMap();
        this.A00 = new Bundle();
    }
}
