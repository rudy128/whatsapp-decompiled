package X;

import android.content.SharedPreferences;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.core.integrity.f;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.A2f  reason: case insensitive filesystem */
public final class C19992A2f {
    public StandardIntegrityManager.StandardIntegrityTokenProvider A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final C26031Qo A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass118 A06;
    public final AnonymousClass19D A07;
    public final AnonymousClass10I A08;

    public final synchronized void A02(B5F b5f, String str) {
        C30391dr r2;
        Object obj;
        AnonymousClass9LB r1;
        SharedPreferences.Editor editor;
        StringBuilder A19 = AnonymousClass3MZ.A19(str, 1);
        A19.append("GPIA_PREPARE_CALL_");
        String A0y = AnonymousClass000.A0y(C108975cc.A0e(str), A19);
        AnonymousClass00H r5 = this.A04;
        AnonymousClass8BR.A0W(r5).A00(A0y);
        try {
            if (A04()) {
                Log.w("A35CF73350448998D91C");
                AnonymousClass8BR.A0W(r5).A01(A0y, "_PREPARED");
                if (b5f != null) {
                    r2 = (C30391dr) ((AVN) b5f).A01;
                    obj = C27621Wu.A00;
                }
            } else {
                if (!this.A05.A09()) {
                    Log.w("437C48065B186A1C9628");
                    AnonymousClass8BR.A0W(r5).A01(A0y, "_NONETWORK");
                    if (b5f != null) {
                        r1 = new AnonymousClass9LB(1001);
                    }
                } else {
                    AnonymousClass11P r22 = this.A01;
                    C19830z4 r7 = this.A02;
                    AnonymousClass00H r10 = r7.A00;
                    if ((System.currentTimeMillis() - r22.A03) - C17890vO.A05(C17880vN.A0B(r10), "pref_last_gpia_prepare_call_timestamp") < 60000) {
                        int A002 = C17890vO.A00(C17880vN.A0B(r10), "pref_gpia_prepare_call_count_in_last_interval");
                        if (A002 >= 5) {
                            Log.w("B68CE0F8025A11AEDA2F");
                            AnonymousClass8BR.A0W(r5).A01(A0y, "_TOOMANY");
                            if (b5f != null) {
                                r1 = new AnonymousClass9LB(1002);
                            }
                        } else {
                            editor = C19830z4.A00(r7).putInt("pref_gpia_prepare_call_count_in_last_interval", A002 + 1);
                        }
                    } else {
                        editor = C19830z4.A00(r7).putInt("pref_gpia_prepare_call_count_in_last_interval", 1);
                    }
                    editor.apply();
                    C17880vN.A1D(C19830z4.A00(r7), "pref_last_gpia_prepare_call_timestamp", System.currentTimeMillis() - r22.A03);
                    StandardIntegrityManager createStandard = IntegrityManagerFactory.createStandard(this.A06.A00);
                    C18070vi.A0X(createStandard);
                    C200710s A003 = C200710s.A00(this.A08);
                    StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder builder = StandardIntegrityManager.PrepareIntegrityTokenRequest.builder();
                    builder.setCloudProjectNumber(293955441834L);
                    Task prepareIntegrityToken = createStandard.prepareIntegrityToken(builder.build());
                    AJM.A00(prepareIntegrityToken, new B1O(b5f, this, A0y), 4);
                    prepareIntegrityToken.addOnFailureListener((Executor) A003, (OnFailureListener) new AJH(b5f, this, A0y, 1));
                }
                r2 = (C30391dr) ((AVN) b5f).A01;
                obj = C108945cZ.A1J(r1);
            }
            r2.resumeWith(obj);
        } catch (Exception e) {
            this.A03.A01(AnonymousClass8oF.A01, "exception_thrown", e);
            AnonymousClass8BR.A0W(r5).A01(A0y, "_EXCEPTION");
            if (b5f != null) {
                ((C30391dr) ((AVN) b5f).A01).resumeWith(C108945cZ.A1J(e));
            }
        }
    }

    public final synchronized void A03(C22513BAw bAw, String str, String str2) {
        C18070vi.A0i(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GPIA_TRIGGER_CALL_");
        String A0y = AnonymousClass000.A0y(C108975cc.A0e(str2), A10);
        AnonymousClass00H r4 = this.A04;
        AnonymousClass8BR.A0W(r4).A00(A0y);
        if (!A04()) {
            this.A03.A00(AnonymousClass8oF.A02, "NULL integrityTokenProvider");
            AnonymousClass8BR.A0W(r4).A01(A0y, "_NOTPREPARED");
            e = new AnonymousClass9LB(1003);
        } else {
            try {
                StandardIntegrityManager.StandardIntegrityTokenRequest.Builder builder = StandardIntegrityManager.StandardIntegrityTokenRequest.builder();
                ((f) builder).a = str;
                StandardIntegrityManager.StandardIntegrityTokenRequest build = builder.build();
                StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = this.A00;
                C18070vi.A0b(standardIntegrityTokenProvider);
                Task request = standardIntegrityTokenProvider.request(build);
                AJM.A00(request, new B1P(bAw, this, A0y), 3);
                request.addOnFailureListener(new AJH(bAw, this, A0y, 0));
            } catch (Exception e) {
                e = e;
                this.A03.A01(AnonymousClass8oF.A02, "exception_thrown", e);
                AnonymousClass8BR.A0W(r4).A01(A0y, "_EXCEPTION");
            }
        }
        bAw.onFailure(e);
        return;
    }

    public final synchronized boolean A04() {
        return AnonymousClass000.A1W(this.A00);
    }

    public static final String A00(Exception exc) {
        ApiException apiException;
        Integer valueOf;
        if (!(exc instanceof ApiException) || (apiException = (ApiException) exc) == null || (valueOf = Integer.valueOf(apiException.mStatus.A00)) == null) {
            return "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('/');
        return C17890vO.A0V(valueOf, A10);
    }

    public C19992A2f(AnonymousClass11E r1, AnonymousClass11P r2, AnonymousClass118 r3, C19830z4 r4, C26031Qo r5, AnonymousClass19D r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0w(r2, r5, r6, r4, r1);
        C18070vi.A0q(r3, r7, r8);
        this.A01 = r2;
        this.A03 = r5;
        this.A07 = r6;
        this.A02 = r4;
        this.A05 = r1;
        this.A06 = r3;
        this.A08 = r7;
        this.A04 = r8;
    }

    public final Object A01(String str, C30391dr r5) {
        C31781g7 A0s = AnonymousClass8BX.A0s(r5);
        A02(new AVN(A0s, 1), str);
        Object A0C = A0s.A0C();
        if (A0C != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A0C;
    }
}
