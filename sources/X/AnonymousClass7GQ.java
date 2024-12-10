package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.EnumMap;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7GQ  reason: invalid class name */
public final class AnonymousClass7GQ implements C72373Lr {
    public final /* synthetic */ AnonymousClass732 A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ AnonymousClass8A2 A02;
    public final /* synthetic */ C128076fP A03;
    public final /* synthetic */ C132946nu A04;
    public final /* synthetic */ C139206yP A05;
    public final /* synthetic */ PrivateKey A06;

    public void Bsu(C122936Sm r8) {
        C18070vi.A0d(r8, 0);
        C139206yP r5 = this.A05;
        AnonymousClass732 r0 = this.A00;
        AnonymousClass8A2 r3 = this.A02;
        C139206yP.A00(r0, this.A01, r8.node, r3, this.A04, r5, C122936Sm.A00(r8));
    }

    public AnonymousClass7GQ(AnonymousClass732 r1, AnonymousClass705 r2, AnonymousClass8A2 r3, C128076fP r4, C132946nu r5, C139206yP r6, PrivateKey privateKey) {
        this.A05 = r6;
        this.A06 = privateKey;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }

    public void BrA() {
        this.A02.BrA();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.87L] */
    public void C7l(C134676qy r21) {
        Object obj;
        Throwable jSONException;
        List list;
        C134676qy r7 = r21;
        C18070vi.A0d(r7, 0);
        try {
            C139206yP r4 = this.A05;
            JSONObject A0l = C108975cc.A0l(r7.A00, r4.A01, this.A06);
            if (A0l.has("data")) {
                JSONObject A16 = C17880vN.A16(A0l.getString("data"));
                C128076fP r0 = this.A03;
                AnonymousClass8A2 r8 = r0.A00;
                C139206yP r1 = r0.A01;
                if (r1 instanceof C122186Ob) {
                    ((C122186Ob) r1).A02.get();
                    JSONArray jSONArray = A16.getJSONArray("waffle_ialsv");
                    int length = jSONArray.length();
                    int i = 0;
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (jSONArray.getJSONObject(i2).getBoolean("is_valid")) {
                            z = true;
                        }
                    }
                    EnumMap enumMap = new EnumMap(C122646Re.class);
                    if (!z) {
                        obj = new C135076rc(enumMap, false);
                    } else {
                        JSONArray jSONArray2 = A16.getJSONArray("waffle_xr");
                        int length2 = jSONArray2.length();
                        while (i < length2) {
                            JSONObject jSONObject = jSONArray2.getJSONObject(i);
                            C18070vi.A0X(jSONObject);
                            long j = jSONObject.getLong("waffle_unique_id");
                            int i3 = jSONObject.getInt("response_code");
                            String A0J = C18070vi.A0J("waffle_da", jSONObject);
                            if ("story".equalsIgnoreCase(C18070vi.A0J("waffle_ds", jSONObject))) {
                                for (C122646Re r12 : C122646Re.A00) {
                                    if (C18070vi.A18(r12.iqValue, A0J)) {
                                        C135576sQ r10 = (C135576sQ) enumMap.get(r12);
                                        if (r10 == null) {
                                            r10 = new C135576sQ(AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13());
                                            enumMap.put(r12, r10);
                                        }
                                        if (i3 != 0) {
                                            if (i3 != 1) {
                                                if (i3 == 2) {
                                                    list = r10.A00;
                                                    list.add(Long.valueOf(j));
                                                    i++;
                                                } else if (i3 != 3) {
                                                    if (i3 != 4) {
                                                        i++;
                                                    }
                                                }
                                            }
                                            list = r10.A01;
                                            list.add(Long.valueOf(j));
                                            i++;
                                        }
                                        list = r10.A02;
                                        list.add(Long.valueOf(j));
                                        i++;
                                    }
                                }
                                jSONException = new NoSuchElementException("Collection contains no element matching the predicate.");
                            } else {
                                jSONException = new JSONException("Error: unexpected response");
                            }
                            throw jSONException;
                        }
                        obj = new C135076rc(enumMap, true);
                    }
                } else {
                    obj = A16;
                    if (!(r1 instanceof AnonymousClass6OZ)) {
                        if (r1 instanceof C122176Oa) {
                            obj = Boolean.valueOf(A16.optBoolean("success", false));
                        } else {
                            boolean optBoolean = A16.optBoolean("success", false);
                            obj = new C128846gm(new C1418477e(new Object(), String.class, A16.optString("bloks_passthrough_params", ""), "WafflePostLinkResponse"), A16.optString("machine_id", (String) null), optBoolean);
                        }
                    }
                }
                r8.onSuccess(obj);
            } else if (A0l.has("error")) {
                int optInt = C17880vN.A16(A0l.getString("error")).optInt("code", -1);
                C139206yP.A00(this.A00, this.A01, (C29621ca) null, this.A02, this.A04, r4, optInt);
            }
        } catch (GeneralSecurityException e) {
            this.A02.Bsx(e, (Integer) null);
        } catch (UnsupportedEncodingException e2) {
            this.A02.Bsx(e2, (Integer) null);
        } catch (JSONException e3) {
            this.A02.Bsx(e3, (Integer) null);
        }
    }
}
