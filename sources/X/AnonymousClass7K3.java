package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.ml.v2.repo.MLModelRepository;
import com.whatsapp.ml.v2.repo.MLModelRepository$cleanup$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7K3  reason: invalid class name */
public final class AnonymousClass7K3 implements AnonymousClass8Ak {
    public final AnonymousClass118 A00;
    public final C19830z4 A01;
    public final MLModelRepository A02;
    public final C88534a3 A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C153227pB(this));
    public final C128576gL A05;
    public final C138026wP A06 = new C138026wP(AnonymousClass00R.A00, TimeUnit.MILLISECONDS);

    public void BkW(AnonymousClass6TT r9) {
        Object obj;
        C18070vi.A0d(r9, 0);
        C19830z4 r7 = this.A01;
        AnonymousClass00H r3 = r7.A00;
        String A0r = C17880vN.A0r(C17880vN.A0B(r3), "voice_message_transcription_model_download_last_status");
        if (A0r != null) {
            obj = C137336vI.A00(A0r);
        } else {
            obj = C119926Al.A00;
        }
        if (!C18070vi.A18(obj, r9) && (r9 instanceof C119876Ag)) {
            if (C17880vN.A0B(r3).getInt("voice_message_transcription_model_download_retry_count", 0) >= 5) {
                this.A03.A06();
                MLModelRepository mLModelRepository = this.A02;
                C122716Rq r4 = C122716Rq.TRANSCRIPTION;
                AnonymousClass3MW.A1X(mLModelRepository.A03, new MLModelRepository$cleanup$1(r4, mLModelRepository, (C30391dr) null), mLModelRepository.A04);
            } else {
                C17900vP.A0M(r7, "voice_message_transcription_model_download_retry_count", C17880vN.A0B(r3).getInt("voice_message_transcription_model_download_retry_count", 0) + 1);
            }
        }
        C17880vN.A1E(C19830z4.A00(r7), "voice_message_transcription_model_download_last_status", C137336vI.A01(r9));
    }

    public List BMy() {
        return AnonymousClass3MW.A11(this.A04);
    }

    public List BRe() {
        String string;
        C22821Di r13;
        Context context = this.A00.A00;
        String A0m = AnonymousClass3MY.A0m(context.getResources(), 2131899513);
        ArrayList A032 = this.A02.A03(C122716Rq.TRANSCRIPTION);
        ArrayList A0D = C29351c6.A0D(A032);
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            AnonymousClass708 r9 = (AnonymousClass708) it.next();
            long A002 = C138776xf.A00(r9);
            Resources resources = context.getResources();
            Object[] A1a = AnonymousClass3MW.A1a();
            boolean z = false;
            AnonymousClass3MX.A1S(A1a, 0, A002);
            String string2 = resources.getString(2131899515, A1a);
            C18070vi.A0X(string2);
            if (C18070vi.A18(r9, BV1())) {
                string = AnonymousClass3MY.A0m(context.getResources(), 2131899359);
                r13 = new C1584480s(this);
                z = true;
            } else {
                Resources resources2 = context.getResources();
                Object[] A1a2 = AnonymousClass3MW.A1a();
                AnonymousClass3MX.A1S(A1a2, 0, C138776xf.A00(r9));
                string = resources2.getString(2131899362, A1a2);
                C18070vi.A0X(string);
                r13 = C1591983p.A00;
            }
            A0D.add(new AnonymousClass4V4(r9, A0m, string2, string, r13, z));
        }
        return A0D;
    }

    public AnonymousClass708 BV1() {
        Object obj;
        C18100vl r4 = this.A04;
        List A11 = AnonymousClass3MW.A11(r4);
        MLModelRepository mLModelRepository = this.A02;
        Iterator it = A11.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (mLModelRepository.A06((AnonymousClass708) obj)) {
                break;
            }
        }
        AnonymousClass708 r1 = (AnonymousClass708) obj;
        if (r1 == null) {
            return (AnonymousClass708) C29431cG.A0b(AnonymousClass3MW.A11(r4));
        }
        return r1;
    }

    public C20078A6e Bbr() {
        Integer num;
        if (AnonymousClass3MX.A1T(C17890vO.A0B(this.A03.A00), "PREF_IS_DOWNLOAD_TRANSCRIPT_MODEL_WIFI_ONLY")) {
            num = AnonymousClass00R.A0C;
        } else {
            num = AnonymousClass00R.A01;
        }
        A1B a1b = new A1B();
        a1b.A00 = num;
        return a1b.A01();
    }

    public boolean isEnabled() {
        return this.A03.A09();
    }

    public AnonymousClass7K3(AnonymousClass118 r5, C19830z4 r6, MLModelRepository mLModelRepository, C88534a3 r8) {
        C18070vi.A0s(r5, mLModelRepository, r8, r6);
        this.A00 = r5;
        this.A02 = mLModelRepository;
        this.A03 = r8;
        this.A01 = r6;
        Context context = r5.A00;
        this.A05 = new C128576gL(88, AnonymousClass3MY.A0m(context.getResources(), 2131899512), AnonymousClass3MY.A0m(context.getResources(), 2131899511));
    }

    public C138026wP BNJ() {
        return this.A06;
    }

    public C128576gL BVR() {
        return this.A05;
    }

    public List BXN() {
        return null;
    }
}
