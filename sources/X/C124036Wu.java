package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: X.6Wu  reason: invalid class name and case insensitive filesystem */
public abstract class C124036Wu {
    public static final boolean A00(Context context, AnonymousClass1KB r11, C219217x r12, Integer num, C22821Di r14) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = !r12.A0E();
        boolean z2 = !r12.A0F();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("request/permission/checkMetaAIVoicePermissions needMicPerm = ");
        A10.append(z);
        C17900vP.A0n(", needModifyAudioSettingsPerm = ", A10, z2);
        if (!z && !z2) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (z) {
                i4 = 2131887889;
                if (z2) {
                    i4 = 2131887890;
                }
            } else {
                i4 = 2131887888;
            }
            r11.A06(i4, 1);
            return false;
        }
        ArrayList A13 = AnonymousClass000.A13();
        if (z2) {
            A13.add("android.permission.MODIFY_AUDIO_SETTINGS");
        }
        if (z) {
            A13.add("android.permission.RECORD_AUDIO");
        }
        String[] A1b = C17890vO.A1b(A13, 0);
        if (!z) {
            iArr = new int[0];
            i = 2131894270;
            i2 = 2131894269;
            i3 = 2131231757;
        } else if (z2) {
            iArr = new int[]{2131232106, 2131231658, 2131231757};
            i = 2131894364;
            i2 = 2131894363;
            i3 = 0;
        } else {
            iArr = new int[0];
            i = 2131894372;
            i2 = 2131894371;
            i3 = 2131232106;
        }
        Intent putExtra = C17880vN.A0A().setClassName(context.getPackageName(), "com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity").putExtra("voice_entrypoint", num).putExtra("drawable_ids", iArr).putExtra("drawable_id", i3).putExtra("permissions", A1b).putExtra("message_id", i).putExtra("perm_denial_message_id", i2).putExtra("force_ui", true);
        C18070vi.A0X(putExtra);
        r14.invoke(putExtra);
        return false;
    }
}
