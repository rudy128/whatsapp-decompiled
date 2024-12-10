package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

public class A8A {
    public int A00 = 5242880;
    public final AnonymousClass190 A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass181 A05;
    public final C220418j A06;
    public final AnonymousClass11W A07;

    public static void A00(FileOutputStream fileOutputStream, Boolean bool, String str) {
        if (bool != null) {
            try {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(";");
                A10.append(str);
                fileOutputStream.write(AnonymousClass001.A1E(bool, ":", A10).getBytes());
            } catch (IOException e) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C17890vO.A13(str, A102, e);
            }
        }
    }

    public static void A01(FileOutputStream fileOutputStream, Double d, String str) {
        if (d != null) {
            try {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(";");
                A10.append(str);
                A10.append(":");
                A10.append(String.format(Locale.US, "%.2f", AnonymousClass8BV.A1b(d)));
                AnonymousClass8BW.A1G(fileOutputStream, A10);
            } catch (IOException e) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C17890vO.A13(str, A102, e);
            }
        }
    }

    public static void A02(FileOutputStream fileOutputStream, Integer num, String str) {
        if (num != null) {
            try {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(";");
                A10.append(str);
                fileOutputStream.write(AnonymousClass001.A1E(num, ":", A10).getBytes());
            } catch (IOException e) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C17890vO.A13(str, A102, e);
            }
        }
    }

    public static void A03(FileOutputStream fileOutputStream, Long l, String str) {
        if (l != null) {
            try {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(";");
                A10.append(str);
                fileOutputStream.write(AnonymousClass001.A1E(l, ":", A10).getBytes());
            } catch (IOException e) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C17890vO.A13(str, A102, e);
            }
        }
    }

    public static void A04(FileOutputStream fileOutputStream, String str, String str2) {
        if (str2 != null) {
            try {
                String replaceAll = str2.replaceAll(":", "_").replaceAll(";", "_");
                StringBuilder A10 = AnonymousClass000.A10();
                C17900vP.A0c(";", str, ":", replaceAll, A10);
                AnonymousClass8BW.A1G(fileOutputStream, A10);
            } catch (IOException e) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("app/VoipTimeSeriesLogger: couldn't inject FS ");
                C17890vO.A13(str, A102, e);
            }
        }
    }

    public static boolean A05(A8A a8a, WamCall wamCall, File file, Boolean bool) {
        String str;
        String str2;
        FileInputStream A18;
        File file2 = file;
        boolean z = false;
        if (file2.exists()) {
            A8A a8a2 = a8a;
            AnonymousClass190 r4 = a8a2.A01;
            String A0A = r4.A0A();
            Boolean bool2 = bool;
            C20669AUb aUb = new C20669AUb(bool2, a8a2, file2, 0);
            C220418j r14 = a8a2.A06;
            boolean booleanValue = bool2.booleanValue();
            if (booleanValue) {
                str = "https://crashlogs.whatsapp.net/whatson_logs_upload";
            } else {
                str = "https://crashlogs.whatsapp.net/wa_clb_data";
            }
            A7N a7n = new A7N(a8a2.A05, aUb, (C184599bD) null, r14, str, a8a2.A07.A02(), (String) null, (String) null, 16, false, false, false);
            if (booleanValue) {
                str2 = "986260562965669|dce80b34bf101b13140cbbf4c809d9ac";
            } else {
                str2 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af";
            }
            a7n.A06("access_token", str2);
            a7n.A07("from_jid", A0A);
            a7n.A07("tags", "voip_time_series");
            WamCall wamCall2 = wamCall;
            if (wamCall != null) {
                String str3 = wamCall2.callReplayerId;
                if (str3 != null && str3.length() > 0) {
                    a7n.A07("call_id", str3);
                }
                Long l = wamCall2.maxConnectedParticipants;
                if (l != null) {
                    a7n.A07("additional_metadata[max_participants]", l.toString());
                }
                Long l2 = wamCall2.numConnectedParticipants;
                if (l2 != null) {
                    a7n.A07("additional_metadata[num_participants]", l2.toString());
                }
            }
            try {
                A18 = C108945cZ.A18(file2);
                A7N.A03(a7n, file2, A18, "file");
                int A042 = a7n.A04((C191779nA) null);
                if (A042 >= 400) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("app/VoiceService: upload of time series log date failed with response code: ");
                    A10.append(A042);
                    C17900vP.A0Z(bool2, " using Whatson API: ", A10);
                } else {
                    z = true;
                }
                A18.close();
                if (!file2.delete()) {
                    Log.i("app/VoiceService: dummy time series log could not be deleted");
                    return z;
                }
            } catch (IOException e) {
                try {
                    Log.w("app/VoiceService: could not upload time series log data", e);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("uploadError:");
                    A102.append(e);
                    AnonymousClass8BV.A1I(file2, " File size: ", A102);
                    r4.A0G("voip-time-series-upload-fail", A102.toString(), true);
                } finally {
                    if (!file2.delete()) {
                        Log.i("app/VoiceService: dummy time series log could not be deleted");
                    }
                }
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return z;
        throw th;
    }

    public /* synthetic */ void A06() {
        FileOutputStream A19;
        Integer A052 = Voip.A05("options.wa_call_dummy_size");
        if (A052 == null) {
            this.A01.A0G("voip-time-series-upload-fail", ":dummyFileSizeUndefined:", false);
            return;
        }
        File A062 = C40811vJ.A06(this.A02.A00);
        if (A062 == null) {
            AnonymousClass190 r2 = this.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A052.intValue() * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            r2.A0G("voip-time-series-upload-fail", AnonymousClass000.A0y(":voipDirectoryError:", A10), false);
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("dummy_");
        File A0X = AnonymousClass8BW.A0X(A062, C181799Rw.A00(6), A102);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("app/VoiceService: putting dummy time series at ");
        C17890vO.A1A(A103, A0X.getAbsolutePath());
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        new Random().nextBytes(bArr);
        try {
            A19 = C108945cZ.A19(A0X);
            for (int i = 0; i < A052.intValue(); i++) {
                A19.write(bArr);
            }
            A19.close();
            A05(this, (WamCall) null, A0X, AnonymousClass000.A0i());
            return;
        } catch (IOException e) {
            Log.w("app/VoiceService: could not create dummy time series", e);
            AnonymousClass190 r22 = this.A01;
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append(String.valueOf(A052.intValue() * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH));
            r22.A0G("voip-time-series-upload-fail", AnonymousClass000.A0y(":fileCreationError:", A104), true);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public A8A(AnonymousClass190 r2, AnonymousClass181 r3, AnonymousClass118 r4, AnonymousClass18K r5, C220418j r6, AnonymousClass11W r7, AnonymousClass10I r8) {
        this.A01 = r2;
        this.A02 = r4;
        this.A04 = r8;
        this.A07 = r7;
        this.A05 = r3;
        this.A03 = r5;
        this.A06 = r6;
    }

    public void A07(WamCall wamCall, Boolean bool, String str) {
        Boolean bool2 = bool;
        this.A04.CGF(new C21468AkZ(bool2, this, wamCall, C108945cZ.A17(str), new C170898qq(), 13));
    }
}
