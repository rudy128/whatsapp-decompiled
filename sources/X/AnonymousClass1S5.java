package X;

import com.whatsapp.Mp4Ops;
import java.io.File;
import java.util.Locale;

/* renamed from: X.1S5  reason: invalid class name */
public class AnonymousClass1S5 {
    public final C18030ve A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass11P A02;

    public AnonymousClass2HR A02(File file, File file2) {
        AnonymousClass2HR r4 = null;
        int i = 1 << 7;
        if ((C18020vd.A00(C18040vf.A02, this.A00, 5561) & i) == i) {
            r4 = new AnonymousClass2HR();
            r4.A0B = Long.valueOf(file.length());
            r4.A0C = 0L;
            if (file2 != null) {
                r4.A0C = Long.valueOf(0 + file2.length());
            }
            r4.A02 = 0;
            r4.A03 = Mp4Ops.A00();
            r4.A04 = 7;
            r4.A0E = Long.valueOf(System.nanoTime());
        }
        return r4;
    }

    public static AnonymousClass2HR A00(AnonymousClass1S5 r2, File file, Integer num, boolean z) {
        long j;
        String lowerCase;
        int i;
        int A002 = C18020vd.A00(C18040vf.A02, r2.A00, 5561);
        int intValue = 1 << num.intValue();
        if ((A002 & intValue) != intValue) {
            return null;
        }
        AnonymousClass2HR r22 = new AnonymousClass2HR();
        if (z) {
            j = 0;
        } else {
            j = 2;
        }
        r22.A0A = Long.valueOf(j);
        r22.A0B = Long.valueOf(file.length());
        String A09 = C64062u9.A09(file.getAbsolutePath());
        if (A09 == null) {
            lowerCase = "";
        } else {
            lowerCase = A09.toLowerCase(Locale.US);
        }
        r22.A02 = 0;
        if (lowerCase.equals("mov")) {
            i = 1;
        } else {
            if (lowerCase.equals("mpd")) {
                i = 2;
            }
            r22.A03 = Mp4Ops.A00();
            r22.A04 = num;
            r22.A0E = Long.valueOf(System.nanoTime());
            return r22;
        }
        r22.A02 = Integer.valueOf(i);
        r22.A03 = Mp4Ops.A00();
        r22.A04 = num;
        r22.A0E = Long.valueOf(System.nanoTime());
        return r22;
    }

    public static boolean A01(AnonymousClass1S5 r3, Integer num) {
        int A002 = C18020vd.A00(C18040vf.A02, r3.A00, 5658);
        int intValue = 1 << num.intValue();
        if ((A002 & intValue) == intValue) {
            return true;
        }
        return false;
    }

    public void A03(Mp4Ops.LibMp4OperationResult libMp4OperationResult, AnonymousClass2HR r6, File file) {
        long length;
        if (r6 != null) {
            Long l = r6.A0E;
            if (l != null) {
                r6.A0E = Long.valueOf(System.nanoTime() - l.longValue());
            }
            r6.A0D = Long.valueOf((long) libMp4OperationResult.errorCode);
            if (file == null) {
                length = 0;
            } else {
                length = file.length();
            }
            r6.A0C = Long.valueOf(length);
            Mp4Ops.AudioStreamInfo audioStreamInfo = libMp4OperationResult.asi;
            if (audioStreamInfo != null) {
                r6.A06 = Long.valueOf((long) audioStreamInfo.averageBitrateKbps);
                r6.A07 = Long.valueOf((long) audioStreamInfo.numChannels);
                r6.A08 = Long.valueOf((long) audioStreamInfo.samplingRate);
                r6.A00 = Integer.valueOf(audioStreamInfo.subType);
                r6.A09 = 1L;
                r6.A01 = Integer.valueOf(audioStreamInfo.type);
            }
            Mp4Ops.VideoStreamInfo videoStreamInfo = libMp4OperationResult.vsi;
            if (videoStreamInfo != null) {
                r6.A0F = Long.valueOf((long) videoStreamInfo.averageBitrateKbps);
                r6.A0G = Long.valueOf((long) videoStreamInfo.framesPerKseconds);
                r6.A0H = Long.valueOf((long) videoStreamInfo.height);
                r6.A0I = Long.valueOf((long) videoStreamInfo.levelIdc);
                r6.A0J = Long.valueOf((long) videoStreamInfo.profileIdc);
                r6.A0K = Long.valueOf((long) videoStreamInfo.rotationDegrees);
                r6.A0L = 2L;
                r6.A05 = Integer.valueOf(videoStreamInfo.type);
                r6.A0M = Long.valueOf((long) videoStreamInfo.width);
            }
        }
    }

    public void A04(AnonymousClass2H9 r5) {
        if (r5 != null) {
            Long l = r5.A0C;
            if (l != null) {
                r5.A0C = Long.valueOf(System.nanoTime() - l.longValue());
            }
            this.A01.CC7(r5);
        }
    }

    public AnonymousClass1S5(AnonymousClass11P r1, C18030ve r2, AnonymousClass18K r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
