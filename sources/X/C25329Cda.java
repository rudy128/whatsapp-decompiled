package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Cda  reason: case insensitive filesystem */
public abstract class C25329Cda {
    public static ArrayList A00() {
        String str;
        C25185Cab cab;
        int i;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        for (Integer intValue : AnonymousClass00R.A00(3)) {
            switch (intValue.intValue()) {
                case 1:
                    str = "Main";
                    break;
                case 2:
                    str = "Baseline";
                    break;
                default:
                    str = "High";
                    break;
            }
            if ("high".equalsIgnoreCase(str)) {
                i = 8;
            } else if ("main".equalsIgnoreCase(str)) {
                i = 2;
            } else if ("baseline".equalsIgnoreCase(str)) {
                i = 1;
            } else {
                cab = null;
                A132.add(cab);
            }
            cab = new C25185Cab(C24354Bzp.CODEC_VIDEO_H264, i, 256);
            A132.add(cab);
        }
        Iterator it = A132.iterator();
        while (it.hasNext()) {
            BE7.A1R(A13, it);
        }
        return A13;
    }

    public static ArrayList A01(C25092CXd cXd, C26052CrM crM, Boolean bool) {
        ArrayList arrayList;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (bool.booleanValue()) {
            return A00();
        }
        ArrayList A13 = AnonymousClass000.A13();
        boolean z = false;
        int[] iArr = new int[0];
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            iArr = new int[]{7};
        }
        C25092CXd cXd2 = cXd;
        C26052CrM crM2 = crM;
        if (C26162Ctb.A03(cXd2, crM2, iArr) && !C26162Ctb.A04(C24322BzJ.VIDEO, crM2)) {
            z = true;
        }
        if (z) {
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = AnonymousClass000.A13().iterator();
            while (it.hasNext()) {
                BE7.A1R(A132, it);
            }
            A13.addAll(A132);
        }
        if (i >= 29) {
            if (C26162Ctb.A03(cXd2, crM2, new int[]{6})) {
                C26162Ctb.A04(C24322BzJ.VIDEO, crM2);
            }
        }
        Integer[] numArr = new Integer[4];
        C17880vN.A1T(numArr, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0);
        BEA.A1V(numArr, 256, 1, 64, 2);
        C17880vN.A1T(numArr, 16, 3);
        for (Number number : Arrays.asList(numArr)) {
            int intValue = number.intValue();
            ArrayList A133 = AnonymousClass000.A13();
            try {
                C24354Bzp bzp = C24354Bzp.CODEC_VIDEO_HEVC;
                HashSet A12 = C17880vN.A12();
                for (int i2 = 0; i2 < MediaCodecList.getCodecCount(); i2++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                    if (codecInfoAt.isEncoder()) {
                        String str = bzp.value;
                        ArrayList A134 = AnonymousClass000.A13();
                        Collections.addAll(A134, codecInfoAt.getSupportedTypes());
                        if (A134.contains(str)) {
                            if (codecInfoAt.getName().toLowerCase().contains(".mtk.")) {
                                C26294Cx6.A02(codecInfoAt.getName(), "MediaCodecListWrapper", "skip codec %s ");
                            } else {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(bzp.value);
                                if (!(capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null)) {
                                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                                        Integer valueOf = Integer.valueOf(codecProfileLevel.profile);
                                        Integer valueOf2 = Integer.valueOf(codecProfileLevel.level);
                                        if (C26294Cx6.A01.BfN(3)) {
                                            C26294Cx6.A04("MediaCodecListWrapper", StringFormatUtil.formatStrLocaleSafe("requesting profile,level: [%s,%s], found [%s,%s]", 1, number, valueOf, valueOf2));
                                        }
                                        if (codecProfileLevel.profile == 1) {
                                            int i3 = codecProfileLevel.level;
                                            if (i3 < intValue) {
                                                if (intValue == -1) {
                                                }
                                            } else if (intValue != -1) {
                                                i3 = intValue;
                                            }
                                            A12.add(new C25185Cab(bzp, 1, i3));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C26294Cx6.A02(A12, "EncoderCheck", "encoder support for hevc? %s");
                arrayList = C17880vN.A10(A12);
            } catch (RuntimeException e) {
                C26294Cx6.A0A("EncoderCheck", "hevc support check error", e);
                arrayList = AnonymousClass000.A13();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                BE7.A1R(A133, it2);
            }
            A13.addAll(A133);
        }
        A13.addAll(A00());
        C26294Cx6.A02(A13, "EncoderCheck", "codec setting fallback loop: %s");
        return A13;
    }
}
