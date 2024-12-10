package X;

import com.facebook.common.dextricks.StringTreeSet;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.9Ke  reason: invalid class name and case insensitive filesystem */
public enum C179859Ke implements E68 {
    GENERAL_CHAT_CREATE(188),
    GENERAL_CHAT_ADD(189),
    GENERAL_CHAT_AUTO_ADD_DISABLED(190),
    SUGGESTED_SUBGROUP_ANNOUNCE(191),
    BIZ_BOT_1P_MESSAGING_ENABLED(192),
    CHANGE_USERNAME(193),
    BIZ_COEX_PRIVACY_INIT_SELF(194),
    BIZ_COEX_PRIVACY_TRANSITION_SELF(195),
    SUPPORT_AI_EDUCATION(196),
    BIZ_BOT_3P_MESSAGING_ENABLED(197),
    REMINDER_SETUP_MESSAGE(198),
    REMINDER_SENT_MESSAGE(199),
    REMINDER_CANCEL_MESSAGE(200),
    BIZ_COEX_PRIVACY_INIT(201),
    BIZ_COEX_PRIVACY_TRANSITION(202),
    GROUP_DEACTIVATED(203),
    COMMUNITY_DEACTIVATE_SIBLING_GROUP(204),
    EVENT_UPDATED(205),
    EVENT_CANCELED(206),
    COMMUNITY_OWNER_UPDATED(207),
    COMMUNITY_SUB_GROUP_VISIBILITY_HIDDEN(208),
    CAPI_GROUP_NE2EE_SYSTEM_MESSAGE(209),
    STATUS_MENTION(210),
    USER_CONTROLS_SYSTEM_MESSAGE(211);
    
    public final int value;

    public static C179859Ke A01(String str, int i) {
        return new C179859Ke(str, i, i);
    }

    /* access modifiers changed from: public */
    C179859Ke(int i) {
        this.value = i;
    }

    public static C179859Ke A00(int i) {
        switch (i) {
            case 0:
                return A38;
            case 1:
                return A2u;
            case 2:
                return A1I;
            case 3:
                return A1q;
            case 4:
                return A2W;
            case 5:
                return A39;
            case 6:
                return A3G;
            case 7:
                return A3F;
            case 8:
                return A3B;
            case 9:
                return A3E;
            case 10:
                return A3D;
            case 11:
                return A3C;
            case 12:
                return A3I;
            case 13:
                return A3H;
            case 14:
                return A3J;
            case 15:
                return A3K;
            case 16:
                return A3O;
            case 17:
                return A3L;
            case 18:
                return A3M;
            case 19:
                return A3N;
            case 20:
                return A25;
            case 21:
                return A24;
            case 22:
                return A1z;
            case 23:
                return A20;
            case 24:
                return A1y;
            case 25:
                return A23;
            case 26:
                return A1x;
            case 27:
                return A2G;
            case 28:
                return A2P;
            case 29:
                return A2O;
            case 30:
                return A2J;
            case 31:
                return A2K;
            case 32:
                return A2M;
            case 33:
                return A2I;
            case 34:
                return A14;
            case 35:
                return A13;
            case 36:
                return A15;
            case 37:
                return A1u;
            case 38:
                return A1j;
            case 39:
                return A1h;
            case 40:
                return A1C;
            case 41:
                return A1B;
            case 42:
                return A2R;
            case 43:
                return A29;
            case 44:
                return A1v;
            case 45:
                return A1A;
            case 46:
                return A19;
            case 47:
                return A2e;
            case 48:
                return A2f;
            case 49:
                return A2l;
            case 50:
                return A2m;
            case 51:
                return A2n;
            case 52:
                return A2j;
            case 53:
                return A2k;
            case 54:
                return A2Y;
            case 55:
                return A2d;
            case 56:
                return A2c;
            case 57:
                return A2a;
            case 58:
                return A2b;
            case 59:
                return A2Z;
            case 60:
                return A0L;
            case 61:
                return A0K;
            case 62:
                return A0B;
            case 63:
                return A0A;
            case 64:
                return A0D;
            case 65:
                return A0C;
            case 66:
                return A0J;
            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                return A0I;
            case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                return A2X;
            case 69:
                return A21;
            case 70:
                return A2Q;
            case 71:
                return A2H;
            case 72:
                return A1E;
            case 73:
                return A1f;
            case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                return A3P;
            case C166418cr.EVENT_MESSAGE_FIELD_NUMBER:
                return A1i;
            case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
                return A0N;
            case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER:
                return A0O;
            case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                return A0P;
            case 79:
                return A0Q;
            case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER:
                return A0T;
            case 81:
                return A0U;
            case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER:
                return A0X;
            case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER:
                return A0Y;
            case 84:
                return A0Z;
            case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER:
                return A0a;
            case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER:
                return A0b;
            case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER:
                return A0c;
            case C166418cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER:
                return A0d;
            case 89:
                return A0e;
            case 90:
                return A0f;
            case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER:
                return A0g;
            case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER:
                return A0h;
            case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER:
                return A0i;
            case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER:
                return A0j;
            case 95:
                return A0l;
            case 96:
                return A0m;
            case 97:
                return A0o;
            case 98:
                return A0p;
            case 99:
                return A0q;
            case 100:
                return A0r;
            case 101:
                return A0s;
            case 102:
                return A0t;
            case 103:
                return A0u;
            case 104:
                return A0v;
            case 105:
                return A0w;
            case 106:
                return A0x;
            case 107:
                return A0y;
            case AnonymousClass74N.A03:
                return A0z;
            case 109:
                return A10;
            case 110:
                return A11;
            case 111:
                return A12;
            case 112:
                return A0R;
            case 113:
                return A0S;
            case 114:
                return A0V;
            case 115:
                return A0W;
            case 116:
                return A0k;
            case 117:
                return A0n;
            case 118:
                return A1k;
            case 119:
                return A27;
            case 120:
                return A26;
            case 121:
                return A1w;
            case 122:
                return A0M;
            case 123:
                return A1n;
            case 124:
                return A37;
            case 125:
                return A36;
            case 126:
                return A0F;
            case StringTreeSet.OFFSET_BASE_ENCODING:
                return A0E;
            case 128:
                return A0H;
            case 129:
                return A0G;
            case 130:
                return A1e;
            case 131:
                return A1g;
            case 132:
                return A01;
            case 133:
                return A2A;
            case 134:
                return A1P;
            case 135:
                return A1S;
            case 136:
                return A1T;
            case 137:
                return A1b;
            case 138:
                return A1c;
            case 139:
                return A1d;
            case 140:
                return A2F;
            case 141:
                return A2N;
            case 142:
                return A1L;
            case 143:
                return A1m;
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                return A2C;
            case 145:
                return A2B;
            case 146:
                return A2S;
            case 147:
                return A1Z;
            case 148:
                return A1Y;
            case 149:
                return A1V;
            case 150:
                return A1Q;
            case 151:
                return A2L;
            case 152:
                return A2U;
            case 153:
                return A2V;
            case 154:
                return A04;
            case 155:
                return A1H;
            case 156:
                return A1G;
            case 157:
                return A18;
            case 158:
                return A1W;
            case 159:
                return A16;
            case 160:
                return A05;
            case 161:
                return A17;
            case 162:
                return A2w;
            case 163:
                return A1O;
            case 164:
                return A1N;
            case 165:
                return A32;
            case 166:
                return A33;
            case 167:
                return A1R;
            case 168:
                return A1X;
            case 169:
                return A2y;
            case 170:
                return A2z;
            case 171:
                return A2E;
            case 172:
                return A2D;
            case 173:
                return A1K;
            case 174:
                return A2x;
            case 175:
                return A2p;
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                return A1J;
            case 177:
                return A2o;
            case 178:
                return A2i;
            case 179:
                return A2g;
            case 180:
                return A2h;
            case 181:
                return A2T;
            case 182:
                return A2t;
            case 183:
                return A1l;
            case 184:
                return A2v;
            case 185:
                return A31;
            case 186:
                return A22;
            case 188:
                return GENERAL_CHAT_CREATE;
            case 189:
                return GENERAL_CHAT_ADD;
            case 190:
                return GENERAL_CHAT_AUTO_ADD_DISABLED;
            case 191:
                return SUGGESTED_SUBGROUP_ANNOUNCE;
            case 192:
                return BIZ_BOT_1P_MESSAGING_ENABLED;
            case 193:
                return CHANGE_USERNAME;
            case 194:
                return BIZ_COEX_PRIVACY_INIT_SELF;
            case 195:
                return BIZ_COEX_PRIVACY_TRANSITION_SELF;
            case 196:
                return SUPPORT_AI_EDUCATION;
            case 197:
                return BIZ_BOT_3P_MESSAGING_ENABLED;
            case 198:
                return REMINDER_SETUP_MESSAGE;
            case 199:
                return REMINDER_SENT_MESSAGE;
            case 200:
                return REMINDER_CANCEL_MESSAGE;
            case 201:
                return BIZ_COEX_PRIVACY_INIT;
            case 202:
                return BIZ_COEX_PRIVACY_TRANSITION;
            case 203:
                return GROUP_DEACTIVATED;
            case 204:
                return COMMUNITY_DEACTIVATE_SIBLING_GROUP;
            case 205:
                return EVENT_UPDATED;
            case 206:
                return EVENT_CANCELED;
            case 207:
                return COMMUNITY_OWNER_UPDATED;
            case 208:
                return COMMUNITY_SUB_GROUP_VISIBILITY_HIDDEN;
            case 209:
                return CAPI_GROUP_NE2EE_SYSTEM_MESSAGE;
            case 210:
                return STATUS_MENTION;
            case 211:
                return USER_CONTROLS_SYSTEM_MESSAGE;
            default:
                return null;
        }
    }

    public final int BVW() {
        return this.value;
    }
}
