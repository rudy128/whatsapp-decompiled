package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.profile.coinflip.edit.Hilt_CoinFlipEditBottomSheet;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.25m  reason: invalid class name and case insensitive filesystem */
public abstract class C449725m {
    public static Object A00(int i, AnonymousClass113 r3, Object obj) {
        switch ((i >> 14) & StringTreeSet.OFFSET_BASE_ENCODING) {
            case 0:
                switch (i & 16383) {
                    case 0:
                        return new AnonymousClass172(r3);
                    case 1:
                        return new AnonymousClass172(r3);
                    case 2:
                        return new AnonymousClass172(r3);
                    case 3:
                        return new AnonymousClass172(r3);
                    default:
                        throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
                }
            case 1:
                switch (i & 16383) {
                    case 0:
                        return new Object();
                    case 1:
                        return new AnonymousClass160();
                    case 2:
                        return new C37181p6();
                    case 3:
                        return new C37171p5();
                    case 4:
                        return new Object();
                    case 5:
                        return new Object();
                    case 6:
                        return new AnonymousClass16a();
                    case 7:
                        return new C214516b();
                    case 8:
                        return new C214616c();
                    case 9:
                        return new C214716d();
                    case 10:
                        return new C214816e();
                    case 11:
                        return new C214916f();
                    case 12:
                        return new C215016g();
                    case 13:
                        return new C215116h();
                    case 14:
                        return new C215216i();
                    case 15:
                        return new C215316j();
                    case 16:
                        return new C215416k();
                    case 17:
                        return new C215516l();
                    case 18:
                        return new C215616m();
                    case 19:
                        return new C215716n();
                    case 20:
                        return new C215816o();
                    case 21:
                        return new C215916p();
                    case 22:
                        return new C216016q();
                    case 23:
                        return new C216116r();
                    case 24:
                        return new Object();
                    case 25:
                        return new AnonymousClass175();
                    case 26:
                        return new Object();
                    case 27:
                        return new AnonymousClass165();
                    case 28:
                        return new AnonymousClass16J();
                    case 29:
                        return new Object();
                    case 30:
                        return new Object();
                    case 31:
                        return new Object();
                    case 32:
                        return new Object();
                    case 33:
                        return new Object();
                    case 34:
                        return new Object();
                    case 35:
                        return new AnonymousClass170();
                    case 36:
                        return new Object();
                    case 37:
                        return new C216416v();
                    case 38:
                        return new C216616x();
                    case 39:
                        return new Object();
                    case 40:
                        return new Object();
                    case 41:
                        return new C37141p2();
                    case 42:
                        return new Object();
                    case 43:
                        return new Object();
                    case 44:
                        return new Object();
                    case 45:
                        return new C85054Lx();
                    case 46:
                        return new Object();
                    case 47:
                        return AnonymousClass12Q.A02(AnonymousClass114.A00(), 16432);
                    case 48:
                        return new Object();
                    case 49:
                        return new Object();
                    case 50:
                        return new AnonymousClass163();
                    case 51:
                        return new Object();
                    case 52:
                        return new AnonymousClass163();
                    case 53:
                        return new Object();
                    case 54:
                        return new AnonymousClass163();
                    case 55:
                        return new Object();
                    case 56:
                        return new AnonymousClass163();
                    case 57:
                        return new Object();
                    case 58:
                        return new AnonymousClass163();
                    case 59:
                        return new AnonymousClass163();
                    case 60:
                        return new Object();
                    case 61:
                        return new Object();
                    case 62:
                        return new AnonymousClass172(r3);
                    case 63:
                        return AnonymousClass12Q.A02(AnonymousClass114.A00(), 16448);
                    case 64:
                        return new Object();
                    case 65:
                        return new C37191p7();
                    case 66:
                        return new Object();
                    case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                        return new Object();
                    case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER /*68*/:
                        return AnonymousClass12Q.A02(AnonymousClass114.A00(), 16453);
                    case 69:
                        return new Object();
                    case 70:
                        return new Hilt_CoinFlipEditBottomSheet();
                    case 71:
                        return new Object();
                    case 72:
                        return new Object();
                    case 73:
                        return new Object();
                    case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                        return new Object();
                    case C166418cr.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                        return new Object();
                    case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                        return new Object();
                    case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                        return new AnonymousClass172(r3);
                    case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                        return new C125586bK();
                    case 79:
                        return new AnonymousClass172(r3);
                    case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                        return new AnonymousClass17M();
                    case 81:
                        return new AnonymousClass172(r3);
                    case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                        return new AnonymousClass17P();
                    case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER /*83*/:
                        return new Object();
                    case 84:
                        return new Object();
                    case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER /*85*/:
                        return new Object();
                    case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER /*86*/:
                        return new AnonymousClass3WD();
                    case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER /*87*/:
                        return new Object();
                    case C166418cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER /*88*/:
                        return new Object();
                    case 89:
                        return new Object();
                    case 90:
                        return new Object();
                    case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER /*91*/:
                        return new Object();
                    case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER /*92*/:
                        return new Object();
                    case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER /*93*/:
                        return new Object();
                    case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER /*94*/:
                        return new Object();
                    case 95:
                        return new Object();
                    case 96:
                        return new Object();
                    case 97:
                        return new Object();
                    case 98:
                        return new Object();
                    case 99:
                        return new Object();
                    case 100:
                        return new AnonymousClass176();
                    case 101:
                        return new Object();
                    case 102:
                        return new Object();
                    case 103:
                        return new Object();
                    case 104:
                        return new Object();
                    case 105:
                        return new Object();
                    case 106:
                        return new Object();
                    case 107:
                        return new Object();
                    case AnonymousClass74N.A03 /*108*/:
                        return new Object();
                    case 109:
                        return new Object();
                    case 110:
                        return new Object();
                    case 111:
                        return new Object();
                    case 112:
                        return new Object();
                    case 113:
                        return new Object();
                    case 114:
                        return new Object();
                    case 115:
                        return new C85014Lt();
                    case 116:
                        return new Object();
                    case 117:
                        return AnonymousClass12Q.A02(AnonymousClass114.A00(), 16500);
                    case 118:
                        return new AnonymousClass17B();
                    case 119:
                        return new AnonymousClass178();
                    case 120:
                        return new Object();
                    case 121:
                        return new Object();
                    case 122:
                        return new Object();
                    case 123:
                        return new AnonymousClass7KD();
                    case 124:
                        return new Object();
                    case 125:
                        return new C214415z();
                    default:
                        throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
                }
            case 2:
                return C109025ch.A00(i, r3, obj);
            case 3:
                switch (i & 16383) {
                    case 0:
                        return new Object();
                    case 1:
                        return new ScreenShareResourceManager();
                    case 2:
                        return new C24817CLk();
                    case 3:
                        return new C216216s();
                    case 4:
                        return new Object();
                    case 5:
                        return new Object();
                    case 6:
                        return new Object();
                    case 7:
                        return new Object();
                    case 8:
                        return new Object();
                    case 9:
                        return new Object();
                    case 10:
                        return new Object();
                    case 11:
                        return new Object();
                    case 12:
                        return new Object();
                    case 13:
                        return new Object();
                    case 14:
                        return new Object();
                    case 15:
                        return new Object();
                    case 16:
                        return new Object();
                    case 17:
                        return new Object();
                    case 18:
                        return new Object();
                    case 19:
                        return new Object();
                    case 20:
                        return new Object();
                    case 21:
                        return new Object();
                    case 22:
                        return new Object();
                    case 23:
                        return new Object();
                    case 24:
                        return new Object();
                    case 25:
                        return new Object();
                    case 26:
                        return new Object();
                    case 27:
                        return new Object();
                    case 28:
                        return new Object();
                    case 29:
                        return new Object();
                    case 30:
                        return new Object();
                    case 31:
                        return new Object();
                    case 32:
                        return new Object();
                    case 33:
                        return new C56822i5();
                    case 34:
                        return new AnonymousClass10T();
                    case 35:
                        return new Object();
                    case 36:
                        return new Object();
                    case 37:
                        return new Object();
                    case 38:
                        return new Object();
                    case 39:
                        return new Object();
                    case 40:
                        return new Object();
                    case 41:
                        return new Object();
                    case 42:
                        return new Object();
                    case 43:
                        return new Object();
                    case 44:
                        return new Object();
                    case 45:
                        return new Object();
                    case 46:
                        return new Object();
                    case 47:
                        return new Object();
                    case 48:
                        return new Object();
                    case 49:
                        return new Object();
                    case 50:
                        return new Object();
                    case 51:
                        return new Object();
                    case 52:
                        return new Object();
                    case 53:
                        return new Object();
                    case 54:
                        return new Object();
                    case 55:
                        return new Object();
                    case 56:
                        return new Object();
                    case 57:
                        return new Object();
                    case 58:
                        return new Object();
                    case 59:
                        return new Object();
                    case 60:
                        return new Object();
                    case 61:
                        return new Object();
                    case 62:
                        return new Object();
                    case 63:
                        return new Object();
                    case 64:
                        return new Object();
                    case 65:
                        return new Object();
                    case 66:
                        return new Object();
                    case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                        return new Object();
                    case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER /*68*/:
                        return new Object();
                    case 69:
                        return new Object();
                    case 70:
                        return new Object();
                    case 71:
                        return new Object();
                    case 72:
                        return new Object();
                    case 73:
                        return new Object();
                    case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                        return new Object();
                    case C166418cr.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                        return new Object();
                    case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                        return new Object();
                    case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                        return new Object();
                    case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                        return new Object();
                    case 79:
                        return new Object();
                    case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                        return new Object();
                    case 81:
                        return new Object();
                    case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                        return new Object();
                    case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER /*83*/:
                        return new Object();
                    case 84:
                        return new Object();
                    case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER /*85*/:
                        return new Object();
                    case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER /*86*/:
                        return new Object();
                    case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER /*87*/:
                        return new Object();
                    case C166418cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER /*88*/:
                        return new Object();
                    case 89:
                        return new Object();
                    case 90:
                        return new Object();
                    case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER /*91*/:
                        return new Object();
                    case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER /*92*/:
                        return new Object();
                    case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER /*93*/:
                        return new Object();
                    case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER /*94*/:
                        return new Object();
                    case 95:
                        return new Object();
                    case 96:
                        return new Object();
                    case 97:
                        return new Object();
                    case 98:
                        return new Object();
                    case 99:
                        return new Object();
                    case 100:
                        return new Object();
                    case 101:
                        return new Object();
                    case 102:
                        return new Object();
                    case 103:
                        return new Object();
                    case 104:
                        return new Object();
                    case 105:
                        return new Object();
                    case 106:
                        return new Object();
                    case 107:
                        return new Object();
                    case AnonymousClass74N.A03 /*108*/:
                        return new Object();
                    case 109:
                        return new Object();
                    case 110:
                        return new Object();
                    case 111:
                        return new Object();
                    case 112:
                        return new Object();
                    case 113:
                        return new Object();
                    case 114:
                        return new Object();
                    case 115:
                        return new Object();
                    case 116:
                        return new Object();
                    case 117:
                        return new Object();
                    case 118:
                        return new Object();
                    case 119:
                        return new Object();
                    case 120:
                        return new Object();
                    case 121:
                        return new Object();
                    case 122:
                        return new Object();
                    case 123:
                        return new Object();
                    case 124:
                        return new Object();
                    case 125:
                        return new Object();
                    case 126:
                        return new Object();
                    case StringTreeSet.OFFSET_BASE_ENCODING /*127*/:
                        return new Object();
                    case 128:
                        return new Object();
                    case 129:
                        return new Object();
                    case 130:
                        return new Object();
                    case 131:
                        return new Object();
                    case 132:
                        return new Object();
                    case 133:
                        return new Object();
                    case 134:
                        return new Object();
                    case 135:
                        return new Object();
                    case 136:
                        return new Object();
                    case 137:
                        return new Object();
                    case 138:
                        return new Object();
                    case 139:
                        return new Object();
                    case 140:
                        return new Object();
                    case 141:
                        return new Object();
                    case 142:
                        return new Object();
                    case 143:
                        return new Object();
                    case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                        return new Object();
                    case 145:
                        return new Object();
                    case 146:
                        return new Object();
                    case 147:
                        return new Object();
                    case 148:
                        return new Object();
                    case 149:
                        return new Object();
                    case 150:
                        return new Object();
                    case 151:
                        return new Object();
                    case 152:
                        return new Object();
                    case 153:
                        return new Object();
                    case 154:
                        return new Object();
                    case 155:
                        return new Object();
                    case 156:
                        return new Object();
                    case 157:
                        return new Object();
                    case 158:
                        return new Object();
                    case 159:
                        return new Object();
                    case 160:
                        return new Object();
                    case 161:
                        return new Object();
                    case 162:
                        return new Object();
                    case 163:
                        return new Object();
                    case 164:
                        return new Object();
                    case 165:
                        return new Object();
                    case 166:
                        return new Object();
                    case 167:
                        return new Object();
                    case 168:
                        return new Object();
                    case 169:
                        return new Object();
                    case 170:
                        return new Object();
                    case 171:
                        return new Object();
                    case 172:
                        return new Object();
                    case 173:
                        return new Object();
                    case 174:
                        return new Object();
                    case 175:
                        return new Object();
                    case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                        return new Object();
                    case 177:
                        return new Object();
                    case 178:
                        return new Object();
                    case 179:
                        return new Object();
                    case 180:
                        return new Object();
                    case 181:
                        return new Object();
                    case 182:
                        return new Object();
                    case 183:
                        return new Object();
                    case 184:
                        return new Object();
                    case 185:
                        return new Object();
                    case 186:
                        return new Object();
                    case 187:
                        return new Object();
                    case 188:
                        return new Object();
                    case 189:
                        return new Object();
                    case 190:
                        return new Object();
                    case 191:
                        return new Object();
                    case 192:
                        return new Object();
                    case 193:
                        return new Object();
                    case 194:
                        return new Object();
                    case 195:
                        return new Object();
                    case 196:
                        return new Object();
                    case 197:
                        return new Object();
                    case 198:
                        return new Object();
                    case 199:
                        return new Object();
                    case 200:
                        return new Object();
                    case 201:
                        return new Object();
                    case 202:
                        return new Object();
                    case 203:
                        return new Object();
                    case 204:
                        return new Object();
                    case 205:
                        return new Object();
                    case 206:
                        return new Object();
                    case 207:
                        return new Object();
                    case 208:
                        return new Object();
                    case 209:
                        return new Object();
                    case 210:
                        return new Object();
                    case 211:
                        return new Object();
                    case 212:
                        return new Object();
                    case 213:
                        return new Object();
                    case 214:
                        return new Object();
                    case 215:
                        return new Object();
                    case 216:
                        return new Object();
                    case 217:
                        return new Object();
                    case 218:
                        return new Object();
                    case 219:
                        return new Object();
                    case 220:
                        return new Object();
                    case 221:
                        return new Object();
                    case 222:
                        return new Object();
                    case 223:
                        return new Object();
                    case 224:
                        return new Object();
                    case 225:
                        return new Object();
                    case 226:
                        return new Object();
                    case 227:
                        return new Object();
                    case 228:
                        return new Object();
                    case 229:
                        return new Object();
                    case 230:
                        return new Object();
                    case 231:
                        return new Object();
                    case 232:
                        return new Object();
                    case 233:
                        return new Object();
                    case 234:
                        return new Object();
                    case 235:
                        return new Object();
                    case 236:
                        return new Object();
                    case 237:
                        return new Object();
                    case 238:
                        return new Object();
                    case 239:
                        return new Object();
                    case 240:
                        return new Object();
                    case 241:
                        return new Object();
                    case 242:
                        return new Object();
                    case 243:
                        return new Object();
                    case 244:
                        return new Object();
                    case 245:
                        return new Object();
                    case 246:
                        return new Object();
                    case 247:
                        return new Object();
                    case 248:
                        return new Object();
                    case 249:
                        return new Object();
                    case 250:
                        return new Object();
                    case 251:
                        return new Object();
                    case 252:
                        return new Object();
                    case 253:
                        return new Object();
                    case 254:
                        return new Object();
                    case 255:
                        return new Object();
                    case 256:
                        return new Object();
                    case 257:
                        return new Object();
                    case 258:
                        return new Object();
                    case 259:
                        return new Object();
                    case 260:
                        return new Object();
                    case 261:
                        return new Object();
                    case 262:
                        return new Object();
                    case 263:
                        return new Object();
                    case 264:
                        return new Object();
                    case 265:
                        return new Object();
                    case 266:
                        return new Object();
                    case 267:
                        return new Object();
                    case 268:
                        return new Object();
                    case 269:
                        return new Object();
                    case 270:
                        return new Object();
                    case 271:
                        return new Object();
                    case 272:
                        return new Object();
                    case 273:
                        return new Object();
                    case 274:
                        return new Object();
                    case 275:
                        return new Object();
                    case 276:
                        return new Object();
                    case 277:
                        return new Object();
                    case 278:
                        return new Object();
                    case 279:
                        return new Object();
                    case 280:
                        return new Object();
                    case 281:
                        return new Object();
                    case 282:
                        return new Object();
                    case 283:
                        return new Object();
                    case 284:
                        return new Object();
                    case 285:
                        return new C37151p3();
                    case 286:
                        return new AnonymousClass179();
                    case 287:
                        return new AnonymousClass32M();
                    case 288:
                        return new AnonymousClass32N();
                    case 289:
                        return new Object();
                    case 290:
                        return new Object();
                    case 291:
                        return new Object();
                    case 292:
                        return new Object();
                    case 293:
                        return new Object();
                    case 294:
                        return new Object();
                    case 295:
                        return new Object();
                    case 296:
                        return new Object();
                    case 297:
                        return new Object();
                    case 298:
                        return new Object();
                    case 299:
                        return new Object();
                    case 300:
                        return new Object();
                    case 301:
                        return new Object();
                    case 302:
                        return new Object();
                    case 303:
                        return new Object();
                    case 304:
                        return new Object();
                    case 305:
                        return new Object();
                    case 306:
                        return new Object();
                    case 307:
                        return new Object();
                    case 308:
                        return new C20029A3y();
                    case 309:
                        return new Object();
                    case 310:
                        return new AnonymousClass2Q1();
                    case 311:
                        return new Object();
                    case 312:
                        return new Object();
                    case 313:
                        return new Object();
                    case 314:
                        return new Object();
                    case 315:
                        return new Object();
                    case 316:
                        return new Object();
                    case 317:
                        return new Object();
                    case 318:
                        return new Object();
                    case 319:
                        return new Object();
                    case 320:
                        return new C197599wx();
                    case 321:
                        return new Object();
                    case 322:
                        return new Object();
                    case 323:
                        return new Object();
                    case 324:
                        return new Object();
                    case 325:
                        return new Object();
                    case 326:
                        return new Object();
                    case 327:
                        return new Object();
                    case 328:
                        return new C183919a7();
                    case 329:
                        return new C37111oz();
                    case 330:
                        return new C37121p0();
                    case 331:
                        return new C37131p1();
                    case 332:
                        return new Object();
                    case 333:
                        return new Object();
                    case 334:
                        return new Object();
                    case 335:
                        return new Object();
                    case 336:
                        return new C192089nm();
                    case 337:
                        return new C194539rt();
                    case 338:
                        return new Object();
                    case 339:
                        return C221618v.A01(49492);
                    case 340:
                        return new Object();
                    case 341:
                        return new Object();
                    case 342:
                        return new AnonymousClass163();
                    case 343:
                        return new Object();
                    case 344:
                        return new Object();
                    case 345:
                        return new C47862Kg();
                    case 346:
                        return new C47902Kk();
                    case 347:
                        return new Object();
                    case 348:
                        return new AnonymousClass17E();
                    case 349:
                        return new AnonymousClass17F();
                    case 350:
                        return new Object();
                    case 351:
                        return new AnonymousClass163();
                    case 352:
                        return new AnonymousClass17L();
                    case 353:
                        return new Object();
                    case 354:
                        return new Object();
                    case 355:
                        return new Object();
                    case 356:
                        return new Object();
                    case 357:
                        return new C184249ae();
                    case 358:
                        return C221618v.A01(49507);
                    case 359:
                        return new C184299aj();
                    case 360:
                        return new Object();
                    case 361:
                        return new C185779d8();
                    case 362:
                        return new Object();
                    case 363:
                        return new AnonymousClass9XD();
                    case 364:
                        return new Object();
                    case 365:
                        return new Object();
                    case 366:
                        return new Object();
                    case 367:
                        return new Object();
                    case 368:
                        return new AnonymousClass163();
                    case 369:
                        return new Object();
                    case 370:
                        return new Object();
                    case 371:
                        return new Object();
                    case 372:
                        return new Object();
                    case 373:
                        return new Object();
                    case 374:
                        return new Object();
                    case 375:
                        return new Object();
                    case 376:
                        return new AnonymousClass163();
                    case 377:
                        return new C37081ow();
                    case 378:
                        return new Object();
                    case 379:
                        return new Object();
                    case 380:
                        return new Object();
                    case 381:
                        return new AnonymousClass163();
                    case 382:
                        return new Object();
                    case 383:
                        return new Object();
                    case 384:
                        return new Object();
                    case 385:
                        return new AnonymousClass163();
                    case 386:
                        return new Object();
                    case 387:
                        return new AnonymousClass163();
                    case 388:
                        return new AnonymousClass163();
                    case 389:
                        return new AnonymousClass163();
                    case 390:
                        return new AnonymousClass16T();
                    case 391:
                        return new Object();
                    case 392:
                        return new Object();
                    case 393:
                        return new Object();
                    case 394:
                        return new C214015v();
                    case 395:
                        return new Object();
                    case 396:
                        return new Object();
                    default:
                        throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
                }
            case 4:
                return C24577C9y.A00(i, r3, obj);
            default:
                throw new RuntimeException("Method Switch Binding Exception: ".concat(String.valueOf(i)));
        }
    }
}
