package X;

import android.content.SharedPreferences;

/* renamed from: X.1H7  reason: invalid class name */
public abstract class AnonymousClass1H7 {
    public volatile Object A00;

    public Object A00() {
        SharedPreferences sharedPreferences;
        String str;
        AnonymousClass2DN r0 = (AnonymousClass2DN) this;
        int i = r0.A00;
        Object obj = r0.A01;
        switch (i) {
            case 0:
                sharedPreferences = C38771rr.A00((C38771rr) ((C38761rq) obj).A00.get());
                str = "bonsai_agent_tos_accepted";
                break;
            case 1:
                sharedPreferences = C38771rr.A00((C38771rr) ((C38761rq) obj).A00.get());
                str = "ai_studio_tos_accepted";
                break;
            case 2:
                sharedPreferences = C38771rr.A00((C38771rr) ((C38761rq) obj).A00.get());
                str = "bonsai_invoke_tos_accepted";
                break;
            case 3:
                sharedPreferences = C38771rr.A00((C38771rr) ((C38761rq) obj).A00.get());
                str = "meta_ai_imagine_me_tos_accepted";
                break;
            case 4:
                sharedPreferences = C38771rr.A00((C38771rr) ((C38761rq) obj).A00.get());
                str = "bonsai_meta_ai_shortcut_tos_accepted";
                break;
            default:
                return ((C18090vk) obj).invoke();
        }
        if (sharedPreferences.getBoolean(str, false)) {
            return C38781rs.A02;
        }
        return C38781rs.A03;
    }

    public final synchronized void A02() {
        this.A00 = null;
    }

    public void A03(Object obj) {
        boolean z;
        SharedPreferences.Editor editor;
        String str;
        AnonymousClass2DN r1 = (AnonymousClass2DN) this;
        switch (r1.A00) {
            case 0:
                C38781rs r4 = (C38781rs) obj;
                C18070vi.A0d(r4, 0);
                z = r4.value;
                editor = C38771rr.A00((C38771rr) ((C38761rq) r1.A01).A00.get()).edit();
                str = "bonsai_agent_tos_accepted";
                break;
            case 1:
                C38781rs r42 = (C38781rs) obj;
                C18070vi.A0d(r42, 0);
                z = r42.value;
                editor = C38771rr.A00((C38771rr) ((C38761rq) r1.A01).A00.get()).edit();
                str = "ai_studio_tos_accepted";
                break;
            case 2:
                C38781rs r43 = (C38781rs) obj;
                C18070vi.A0d(r43, 0);
                z = r43.value;
                editor = C38771rr.A00((C38771rr) ((C38761rq) r1.A01).A00.get()).edit();
                str = "bonsai_invoke_tos_accepted";
                break;
            case 3:
                C38781rs r44 = (C38781rs) obj;
                C18070vi.A0d(r44, 0);
                z = r44.value;
                editor = C38771rr.A00((C38771rr) ((C38761rq) r1.A01).A00.get()).edit();
                str = "meta_ai_imagine_me_tos_accepted";
                break;
            case 4:
                C38781rs r45 = (C38781rs) obj;
                C18070vi.A0d(r45, 0);
                z = r45.value;
                editor = C38771rr.A00((C38771rr) ((C38761rq) r1.A01).A00.get()).edit();
                str = "bonsai_meta_ai_shortcut_tos_accepted";
                break;
            default:
                return;
        }
        editor.putBoolean(str, z).apply();
    }

    public final synchronized void A04(Object obj, boolean z) {
        if (z) {
            if (C18070vi.A18(this.A00, obj)) {
            }
        }
        this.A00 = obj;
        A03(obj);
    }

    public final Object A01() {
        Object obj;
        Object obj2 = this.A00;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (obj == null) {
                obj = A00();
                this.A00 = obj;
            }
        }
        return obj;
    }
}
