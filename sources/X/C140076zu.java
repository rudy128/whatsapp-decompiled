package X;

import java.util.Map;

/* renamed from: X.6zu  reason: invalid class name and case insensitive filesystem */
public final class C140076zu {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final Map A07 = C17880vN.A13();
    public final C18100vl A08;

    public static final boolean A00(C140076zu r0) {
        return C72453Mb.A1a(r0.A08);
    }

    public final void A01(AnonymousClass6RB r3) {
        Long l;
        if (C72453Mb.A1a(this.A08)) {
            Map map = this.A07;
            Number A1E = C108945cZ.A1E(r3, map);
            if (A1E != null) {
                l = C108995ce.A0T(A1E);
            } else {
                l = null;
            }
            map.put(r3, l);
        }
    }

    public final void A02(Integer num) {
        String str;
        String str2;
        if (C72453Mb.A1a(this.A08)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("VoipAiRtcLogger/markConnectionSetupPoint markerPoint: ");
            int intValue = num.intValue();
            switch (intValue) {
                case 0:
                    str = "BOTTOM_SHEET_VISIBLE";
                    break;
                case 1:
                    str = "START_CALL_API";
                    break;
                case 2:
                    str = "START_PREPARE_OFFER";
                    break;
                case 3:
                    str = "OFFER_SENT";
                    break;
                case 4:
                    str = "OFFER_ACKED";
                    break;
                case 5:
                    str = "PREACCEPT_RECEIVED";
                    break;
                case 6:
                    str = "ACCEPT_RECEIVED";
                    break;
                case 7:
                    str = "DECRYPT_COMPLETE";
                    break;
                case 8:
                    str = "CALL_ACTIVE_VOIP";
                    break;
                default:
                    str = "AUDIO_TX_STARTED";
                    break;
            }
            C17890vO.A1A(A10, str);
            AnonymousClass19Y r2 = (AnonymousClass19Y) this.A06.get();
            switch (intValue) {
                case 0:
                    str2 = "bottom_sheet_visible";
                    break;
                case 1:
                    str2 = "start_call_api";
                    break;
                case 2:
                    str2 = "start_prepare_offer";
                    break;
                case 3:
                    str2 = "offer_sent";
                    break;
                case 4:
                    str2 = "offer_acked";
                    break;
                case 5:
                    str2 = "preaccept_received";
                    break;
                case 6:
                    str2 = "accept_received";
                    break;
                case 7:
                    str2 = "decrypt_complete";
                    break;
                case 8:
                    str2 = "call_active_voip";
                    break;
                default:
                    str2 = "audio_tx_started";
                    break;
            }
            r2.markerPoint(726214113, str2);
        }
    }

    public final void A03(Integer num) {
        if (C72453Mb.A1a(this.A08)) {
            C17900vP.A0Y(num, "VoipAiRtcLogger/startConnectionSetupMarker entryPoint: ", AnonymousClass000.A10());
            this.A01 = null;
            this.A02 = null;
            this.A00 = null;
            this.A03 = null;
            this.A07.clear();
            AnonymousClass00H r2 = this.A05;
            ((C136746uK) r2.get()).A01();
            this.A01 = num;
            ((AnonymousClass19Y) this.A06.get()).markerStart(726214113);
            ((C136746uK) r2.get()).A02();
        }
    }

    public C140076zu(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A06 = r3;
        this.A05 = r4;
        this.A08 = AnonymousClass1DF.A01(new C149077iT(r2));
    }
}
