package X;

import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7OO  reason: invalid class name */
public final class AnonymousClass7OO implements C1603488c {
    public final /* synthetic */ WaBloksBottomSheetActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ WeakReference A03;

    public AnonymousClass7OO(WaBloksBottomSheetActivity waBloksBottomSheetActivity, String str, String str2, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A00 = waBloksBottomSheetActivity;
        this.A01 = str;
        this.A02 = str2;
    }

    public void BpJ(AnonymousClass6U4 r17) {
        String A0V;
        AnonymousClass6U4 r6 = r17;
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A03);
        if (A0Z != null && !A0Z.isDestroyed() && !A0Z.isFinishing()) {
            A0Z.CEx();
        }
        if (!(r6 instanceof AnonymousClass6N8)) {
            WaBloksBottomSheetActivity waBloksBottomSheetActivity = this.A00;
            String str = null;
            waBloksBottomSheetActivity.CMx((Integer) null, 2131896261, (Integer) null, (Integer) null, (Integer) null, "error_dialog", (String) null, (Object[]) null);
            AnonymousClass00H r0 = waBloksBottomSheetActivity.A01;
            if (r0 != null) {
                C35541mP r5 = (C35541mP) r0.get();
                String str2 = this.A01;
                String str3 = this.A02;
                if (r6.equals(AnonymousClass6N7.A00)) {
                    A0V = "activity_no_longer_active";
                } else if (r6.equals(AnonymousClass6N8.A00)) {
                    A0V = "success";
                } else if (r6 instanceof AnonymousClass6N5) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("bk_layout_data_error_");
                    A0V = C17890vO.A0V(((AnonymousClass6N5) r6).A00.A02, A10);
                } else if (r6 instanceof AnonymousClass6N6) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("unknown_error_");
                    A0V = C17890vO.A0V(((AnonymousClass6N6) r6).A00, A102);
                } else {
                    throw AnonymousClass3MW.A14();
                }
                C18070vi.A0d(A0V, 2);
                if (AnonymousClass1YE.A0A(str2, "com.bloks.www.cxthelp", false)) {
                    if (!(str3 == null || str3.length() == 0)) {
                        try {
                            JSONObject A16 = C17880vN.A16(str3);
                            if (A16.has("params")) {
                                JSONObject jSONObject = A16.getJSONObject("params");
                                if (jSONObject.has("server_params")) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("server_params");
                                    C18070vi.A0b(jSONObject2);
                                    str = A6n.A02("entrypointid", jSONObject2);
                                }
                            }
                        } catch (JSONException e) {
                            Log.e("SupportLogger/getEntryPointId", e);
                        }
                    }
                    C1185063s r1 = new C1185063s();
                    r1.A01 = 5;
                    r1.A02 = str2;
                    r1.A05 = A0V;
                    if (str != null) {
                        r1.A03 = str;
                    }
                    r5.A00.CC4(r1);
                }
                Log.w("WaBloksBottomSheetActivity - failed to launch via Bloks async action");
                return;
            }
            C18070vi.A11("supportLogging");
            throw null;
        }
    }
}
