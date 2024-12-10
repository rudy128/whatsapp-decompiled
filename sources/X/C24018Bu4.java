package X;

import android.os.PowerManager;
import com.whatsapp.media.WamediaManager;

/* renamed from: X.Bu4  reason: case insensitive filesystem */
public final class C24018Bu4 extends C27086DTl {
    public final C24014Bu0 A00;
    public final PowerManager.WakeLock A01;
    public final C218617r A02;
    public final WamediaManager A03;
    public final AnonymousClass1SO A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24018Bu4(PowerManager.WakeLock wakeLock, C218617r r3, WamediaManager wamediaManager, C24014Bu0 bu0, AnonymousClass1SO r6) {
        super(bu0);
        C18070vi.A0d(bu0, 4);
        this.A02 = r3;
        this.A03 = wamediaManager;
        this.A04 = r6;
        this.A00 = bu0;
        this.A01 = wakeLock;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.CX7, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e3, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e6, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("audiotranscoder/sampling rate ");
        r1.append(r13);
        X.C17890vO.A19(r1, " bps is not supported");
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f8, code lost:
        r13 = (byte) r12;
        r2[2] = 64;
        r1 = (byte) ((((byte) r1) << 2) | 64);
        r2[2] = r1;
        X.BE6.A1N(r2, r1, r13 >> 2, 2);
        r2[3] = (byte) ((r13 & 3) << 6);
        r2[4] = 0;
        r2[5] = 0;
        r2[6] = -4;
        r9.start();
        r19 = r9.getInputBuffers();
        r5.A02 = r9.getOutputBuffers();
        r0 = com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS;
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x032e, code lost:
        r0 = com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0331, code lost:
        r13 = r9.dequeueInputBuffer(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0336, code lost:
        if (r13 != -1) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0338, code lost:
        X.DPV.A00(r24, r9, r5, r30, r2);
        r13 = r9.dequeueInputBuffer(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0344, code lost:
        if (r13 < 0) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0346, code lost:
        r12 = r19[r13];
        r14 = r25[r11];
        X.BEA.A15(r3, r14);
        r12.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0350, code lost:
        if (r20 == false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0352, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0357, code lost:
        if (r14.hasRemaining() == false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0359, code lost:
        r1 = r14.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x035f, code lost:
        if ((r15 % 3) == 0) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0361, code lost:
        r12.put(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0364, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0367, code lost:
        r15 = (r3.size * 2) / 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x036e, code lost:
        r12.put(r14);
        r15 = r3.size;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0373, code lost:
        r9.queueInputBuffer(r13, 0, r15, r3.presentationTimeUs, r3.flags);
        X.BEA.A15(r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x038d, code lost:
        if (r16 == 0) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0391, code lost:
        if (r5.A01 == null) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0393, code lost:
        r12 = (int) ((r3.presentationTimeUs * 100) / r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x039d, code lost:
        if (r12 == r23) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a1, code lost:
        if (r5.A06 != false) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03a3, code lost:
        r5.A01.C22(r12);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03aa, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ab, code lost:
        r5.A06 = r0;
        r23 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b0, code lost:
        r21 = r21 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03b4, code lost:
        if (r11 != -3) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03b6, code lost:
        r25 = r10.getOutputBuffers();
        r0 = "audiotranscoder/decoder output buffers have changed.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03be, code lost:
        if (r11 != -2) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03c0, code lost:
        r4 = r10.getOutputFormat();
        r0 = X.AnonymousClass001.A1E(r4, "audiotranscoder/decoder output format has changed to ", X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03ce, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03d2, code lost:
        X.DPV.A00(r24, r9, r5, r30, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03d9, code lost:
        r10.releaseOutputBuffer(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03e0, code lost:
        if ((r3.flags & 4) == 0) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03e2, code lost:
        com.whatsapp.util.Log.i("audiotranscoder/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03e7, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("audiotranscoder/processed frames:");
        r2.append(r5.A00);
        X.C17900vP.A0j(" skipped:", r2, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r10.stop();
        r10.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0402, code lost:
        if (r22 == false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0404, code lost:
        r9.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0407, code lost:
        r9.release();
        r46.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x040d, code lost:
        if (r30 == null) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r30.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0414, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r10.stop();
        r10.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x041b, code lost:
        if (r22 != false) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x041d, code lost:
        r9.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0420, code lost:
        r9.release();
        r46.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0427, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0428, code lost:
        com.whatsapp.util.Log.e(X.C17900vP.A0A("audiotranscoder/can't create decoder for ", r9), r1);
        r46.release();
        r1 = new X.C24141Bw7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0438, code lost:
        com.whatsapp.util.Log.i("audiotranscoder/ no codec supporting audio/mp4a-latm");
        r46.release();
        r1 = new java.io.FileNotFoundException("No codec supporting audio/mp4a-latm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0448, code lost:
        com.whatsapp.util.Log.e(X.C17900vP.A0A("audiotranscoder/can't create decoder for ", r9));
        r46.release();
        r1 = new X.C24141Bw7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0458, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0459, code lost:
        if (r30 != null) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r30.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x045f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0463, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0464, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r31.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0469, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x046d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04b7, code lost:
        r31.close();
        r2 = X.AnonymousClass000.A10();
        r2.append("audiotranscoder finished cancelled:");
        r2.append(r5.A06);
        r2.append(" output:");
        X.C17890vO.A16(r2, r45.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04e7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/libmp4muxexception", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r1 = r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04f3, code lost:
        if (r1 != null) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04f5, code lost:
        r2 = X.AnonymousClass1YF.A0Y(r1, "No space", false);
        r1 = 2131889993;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0500, code lost:
        if (r2 != true) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0503, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r1);
        r1 = 2131889979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x050d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/badaudio", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0513, code lost:
        r1 = 2131889958;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0517, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalargument", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0524, code lost:
        r1 = 2131890005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0527, code lost:
        r48.A05.BJ0(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x052e, code lost:
        X.C27086DTl.A04(r7.A01);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dd, code lost:
        if (r10 < 0) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        r45 = r5.A05;
        r31 = X.C108945cZ.A19(r45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r30 = r31.getChannel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r14 = new android.media.MediaCodecList(0).getCodecInfos();
        r1 = X.AnonymousClass000.A10();
        r1.append("audiotranscoder/number of codecs: ");
        r13 = r14.length;
        X.C17900vP.A0o(r1, r13);
        r29 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0105, code lost:
        if (r12 >= r13) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r16 = r14[r12];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010d, code lost:
        if (r16.isEncoder() == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        r11 = r16.getSupportedTypes();
        r4 = 0;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0116, code lost:
        if (r4 >= r11.length) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0118, code lost:
        if (r15 != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0122, code lost:
        if (r11[r4].equals("audio/mp4a-latm") == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0124, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0128, code lost:
        if (r15 == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012a, code lost:
        r29 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012c, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        if (r29 == null) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0131, code lost:
        r4 = X.AnonymousClass000.A10();
        r4.append("audiotranscoder/found ");
        r4.append(r29.getName());
        X.C17900vP.A0f(" supporting ", "audio/mp4a-latm", r4);
        r0 = r46;
        r4 = r0.getTrackFormat(r10);
        X.C18070vi.A0X(r4);
        r9 = r4.getString("mime");
        r0.selectTrack(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015e, code lost:
        if ("audio/g711-alaw".equals(r9) != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0166, code lost:
        if ("audio/g711-mlaw".equals(r9) == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        if (X.AnonymousClass112.A05() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016e, code lost:
        r10 = X.AnonymousClass000.A10();
        r10.append("audiotranscoder/first sample size: ");
        X.C17890vO.A16(r10, r17.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017e, code lost:
        r4.setInteger("max-input-size", 16384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0189, code lost:
        if (r4.containsKey("durationUs") == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018b, code lost:
        r16 = r4.getLong("durationUs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("audiotranscoder/decoder format:");
        X.C17890vO.A1A(r1, r4.toString());
        r5.A02 = null;
        r5.A00 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a5, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r10 = android.media.MediaCodec.createDecoderByType(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        com.whatsapp.util.Log.i("audiotranscoder/decoder created");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b1, code lost:
        if (r10 == null) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b3, code lost:
        r9 = android.media.MediaCodec.createByCodecName(r29.getName());
        com.whatsapp.util.Log.i("audiotranscoder/encoder created");
        r10.configure(r4, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        com.whatsapp.util.Log.i("audiotranscoder/decoder configured");
        r10.start();
        com.whatsapp.util.Log.i("audiotranscoder/decoder started");
        r26 = r10.getInputBuffers();
        r25 = r10.getOutputBuffers();
        r3 = new android.media.MediaCodec.BufferInfo();
        r24 = new android.media.MediaCodec.BufferInfo();
        r2 = new byte[7];
        r23 = 0;
        r22 = false;
        r21 = 0;
        r20 = false;
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f1, code lost:
        if (r18 != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f3, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f7, code lost:
        if (r5.A06 != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f9, code lost:
        r39 = r10.dequeueInputBuffer(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ff, code lost:
        if (r39 < 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0201, code lost:
        r1 = r26[r39];
        X.C18070vi.A0d(r1, 0);
        r41 = r46.readSampleData(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020c, code lost:
        if (r41 >= 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020e, code lost:
        com.whatsapp.util.Log.i("audiotranscoder/extractor BUFFER_FLAG_END_OF_STREAM");
        r10.queueInputBuffer(r39, 0, 0, 0, 4);
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0223, code lost:
        r10.queueInputBuffer(r39, 0, r41, r46.getSampleTime(), 0);
        r46.advance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0233, code lost:
        r11 = r10.dequeueOutputBuffer(r3, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x023a, code lost:
        if (r11 < 0) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0242, code lost:
        if (r3.presentationTimeUs < 0) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0244, code lost:
        if (r22 != false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0250, code lost:
        if (r29.getName().startsWith("OMX.google") == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0258, code lost:
        if (r4.containsKey("bit-width") == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025a, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0264, code lost:
        if (r4.getInteger("bit-width") == 24) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0266, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0268, code lost:
        r14 = r4.getInteger("sample-rate");
        r13 = r4.getInteger("channel-count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027a, code lost:
        if (r4.containsKey("pcm-encoding") == false) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027c, code lost:
        r12 = r4.getInteger("pcm-encoding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0282, code lost:
        r1 = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", r14, r13);
        r1.setInteger("bitrate", r47);
        r1.setInteger("sample-rate", r14);
        r1.setInteger("channel-count", r13);
        r1.setInteger("aac-profile", 2);
        r1.setInteger("max-input-size", 64000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a8, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02aa, code lost:
        if (r12 == 0) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ac, code lost:
        r1.setInteger("pcm-encoding", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b1, code lost:
        X.C17900vP.A0Y(r1, "audiotranscoder/configuring encoder with output format ", X.AnonymousClass000.A10());
        r9.configure(r1, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        com.whatsapp.util.Log.i("audiotranscoder/encoder configured");
        r13 = r4.getInteger("sample-rate");
        r12 = r4.getInteger("channel-count");
        r2[0] = -1;
        r2[1] = -15;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02d9, code lost:
        r14 = X.DPV.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02dd, code lost:
        if (r1 >= 12) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02e1, code lost:
        if (r13 == r14[r1]) goto L_0x02f8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04ee A[ExcHandler: IOException (r0v14 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0503 A[ExcHandler: FileNotFoundException (r1v8 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x050d A[ExcHandler: Bw7 (r1v7 'e' X.Bw7 A[CUSTOM_DECLARE]), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0517 A[ExcHandler: IllegalStateException (r1v5 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x051e A[ExcHandler: IllegalArgumentException (r1v4 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE]), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0551  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C55362fe A07() {
        /*
            r49 = this;
            r7 = r49
            X.Bu0 r0 = r7.A00
            r48 = r0
            java.io.File r8 = r0.A06
            java.io.File r2 = r0.A00
            long r9 = X.C26511Sk.A05(r2)
            r27 = 1
            r6 = 0
            android.os.PowerManager$WakeLock r0 = r7.A01     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r36 = r0
            if (r0 == 0) goto L_0x001a
            r36.acquire()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
        L_0x001a:
            r0 = r48
            boolean r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r37 = "audio was not transcoded correctly"
            if (r0 == 0) goto L_0x0483
            boolean r0 = X.DPV.A01(r2)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "mediatranscodequeue/audio/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r3 = 0
            r5 = 96000(0x17700, float:1.34525E-40)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003a
            r3 = 96000(0x17700, float:1.34525E-40)
            goto L_0x0043
        L_0x003a:
            long r0 = r2.length()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r3 = 8000(0x1f40, double:3.9525E-320)
            long r0 = r0 * r3
            long r0 = r0 / r9
            int r3 = (int) r0     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
        L_0x0043:
            int r1 = java.lang.Math.min(r3, r5)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0 = 12200(0x2fa8, float:1.7096E-41)
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.CQb r0 = new X.CQb     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0.<init>(r2, r8)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0.A00 = r1     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.DPV r5 = new X.DPV     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r5.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.DPU r0 = new X.DPU     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0.<init>(r7, r6)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r5.A01 = r0     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0 = r48
            r0.A00(r5)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r35 = "pcm-encoding"
            java.lang.String r34 = "channel-count"
            java.lang.String r33 = "sample-rate"
            java.lang.String r32 = "bit-width"
            java.lang.String r2 = "audiotranscoder/can't create decoder for "
            java.lang.String r3 = "durationUs"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "audiotranscoder/bitrate:"
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            int r0 = r5.A03     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r47 = r0
            X.C17900vP.A0o(r1, r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.CVS r17 = new X.CVS     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r17.<init>()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.io.File r0 = r5.A04     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.C18070vi.A0d(r1, r6)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0 = r17
            android.media.MediaExtractor r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r46 = r0
            r0.setDataSource(r1)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            int r1 = r46.getTrackCount()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "audiotranscoder/Number of tracks:"
            X.C17900vP.A0j(r0, r4, r1)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r12 = 0
            r10 = 0
        L_0x00a7:
            java.lang.String r9 = "mime"
            if (r10 >= r1) goto L_0x046e
            r0 = r46
            android.media.MediaFormat r13 = r0.getTrackFormat(r10)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.C18070vi.A0X(r13)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r11 = r13.getString(r9)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "audiotranscoder/track:"
            r4.append(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r4.append(r10)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "mime:"
            r4.append(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r4.append(r11)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = " format:"
            X.C17900vP.A0Y(r13, r0, r4)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "audio"
            boolean r0 = r11.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            if (r0 == 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x00dd:
            if (r10 < 0) goto L_0x046e
            java.io.File r0 = r5.A05     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r45 = r0
            java.io.FileOutputStream r31 = X.C108945cZ.A19(r45)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.nio.channels.FileChannel r30 = r31.getChannel()     // Catch:{ all -> 0x0464 }
            android.media.MediaCodecList r0 = new android.media.MediaCodecList     // Catch:{ all -> 0x0458 }
            r0.<init>(r6)     // Catch:{ all -> 0x0458 }
            android.media.MediaCodecInfo[] r14 = r0.getCodecInfos()     // Catch:{ all -> 0x0458 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audiotranscoder/number of codecs: "
            r1.append(r0)     // Catch:{ all -> 0x0458 }
            int r13 = r14.length     // Catch:{ all -> 0x0458 }
            X.C17900vP.A0o(r1, r13)     // Catch:{ all -> 0x0458 }
            r29 = 0
        L_0x0103:
            java.lang.String r28 = "audio/mp4a-latm"
            if (r12 >= r13) goto L_0x012f
            r16 = r14[r12]     // Catch:{ all -> 0x0458 }
            boolean r0 = r16.isEncoder()     // Catch:{ all -> 0x0458 }
            if (r0 == 0) goto L_0x012c
            java.lang.String[] r11 = r16.getSupportedTypes()     // Catch:{ all -> 0x0458 }
            r4 = 0
            r15 = 0
        L_0x0115:
            int r0 = r11.length     // Catch:{ all -> 0x0458 }
            if (r4 >= r0) goto L_0x0128
            if (r15 != 0) goto L_0x012a
            r1 = r11[r4]     // Catch:{ all -> 0x0458 }
            r0 = r28
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0458 }
            if (r0 == 0) goto L_0x0125
            r15 = 1
        L_0x0125:
            int r4 = r4 + 1
            goto L_0x0115
        L_0x0128:
            if (r15 == 0) goto L_0x012c
        L_0x012a:
            r29 = r16
        L_0x012c:
            int r12 = r12 + 1
            goto L_0x0103
        L_0x012f:
            if (r29 == 0) goto L_0x0438
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audiotranscoder/found "
            r4.append(r0)     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = r29.getName()     // Catch:{ all -> 0x0458 }
            r4.append(r0)     // Catch:{ all -> 0x0458 }
            java.lang.String r1 = " supporting "
            r0 = r28
            X.C17900vP.A0f(r1, r0, r4)     // Catch:{ all -> 0x0458 }
            r0 = r46
            android.media.MediaFormat r4 = r0.getTrackFormat(r10)     // Catch:{ all -> 0x0458 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x0458 }
            java.lang.String r9 = r4.getString(r9)     // Catch:{ all -> 0x0458 }
            r0.selectTrack(r10)     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0458 }
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0458 }
            if (r0 == 0) goto L_0x0185
        L_0x0168:
            boolean r0 = X.AnonymousClass112.A05()     // Catch:{ all -> 0x0458 }
            if (r0 == 0) goto L_0x017e
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audiotranscoder/first sample size: "
            r10.append(r0)     // Catch:{ all -> 0x0458 }
            long r0 = r17.A00()     // Catch:{ all -> 0x0458 }
            X.C17890vO.A16(r10, r0)     // Catch:{ all -> 0x0458 }
        L_0x017e:
            java.lang.String r1 = "max-input-size"
            r0 = 16384(0x4000, float:2.2959E-41)
            r4.setInteger(r1, r0)     // Catch:{ all -> 0x0458 }
        L_0x0185:
            boolean r0 = r4.containsKey(r3)     // Catch:{ all -> 0x0458 }
            if (r0 == 0) goto L_0x01a5
            long r16 = r4.getLong(r3)     // Catch:{ all -> 0x0458 }
        L_0x018f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audiotranscoder/decoder format:"
            r1.append(r0)     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0458 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0458 }
            r0 = 0
            r5.A02 = r0     // Catch:{ all -> 0x0458 }
            r5.A00 = r6     // Catch:{ all -> 0x0458 }
            goto L_0x01a8
        L_0x01a5:
            r16 = 0
            goto L_0x018f
        L_0x01a8:
            android.media.MediaCodec r10 = android.media.MediaCodec.createDecoderByType(r9)     // Catch:{ IllegalArgumentException -> 0x0427 }
            java.lang.String r0 = "audiotranscoder/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0458 }
            if (r10 == 0) goto L_0x0448
            java.lang.String r0 = r29.getName()     // Catch:{ all -> 0x0458 }
            android.media.MediaCodec r9 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audiotranscoder/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0458 }
            r0 = 0
            r10.configure(r4, r0, r0, r6)     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audiotranscoder/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0458 }
            r10.start()     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "audiotranscoder/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0458 }
            java.nio.ByteBuffer[] r26 = r10.getInputBuffers()     // Catch:{ all -> 0x0458 }
            java.nio.ByteBuffer[] r25 = r10.getOutputBuffers()     // Catch:{ all -> 0x0458 }
            android.media.MediaCodec$BufferInfo r3 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0458 }
            r3.<init>()     // Catch:{ all -> 0x0458 }
            android.media.MediaCodec$BufferInfo r24 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0458 }
            r24.<init>()     // Catch:{ all -> 0x0458 }
            r0 = 7
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0458 }
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            goto L_0x01f3
        L_0x01f1:
            if (r18 != 0) goto L_0x03e7
        L_0x01f3:
            r18 = 0
            boolean r0 = r5.A06     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x03e7
            r0 = 0
            int r39 = r10.dequeueInputBuffer(r0)     // Catch:{ all -> 0x0414 }
            if (r39 < 0) goto L_0x0233
            r1 = r26[r39]     // Catch:{ all -> 0x0414 }
            X.C18070vi.A0d(r1, r6)     // Catch:{ all -> 0x0414 }
            r0 = r46
            int r41 = r0.readSampleData(r1, r6)     // Catch:{ all -> 0x0414 }
            if (r41 >= 0) goto L_0x0223
            java.lang.String r0 = "audiotranscoder/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0414 }
            r42 = 0
            r44 = 4
            r41 = r6
            r38 = r10
            r40 = r6
            r38.queueInputBuffer(r39, r40, r41, r42, r44)     // Catch:{ all -> 0x0414 }
            r18 = 1
            goto L_0x0233
        L_0x0223:
            long r42 = r46.getSampleTime()     // Catch:{ all -> 0x0414 }
            r44 = r6
            r38 = r10
            r40 = r6
            r38.queueInputBuffer(r39, r40, r41, r42, r44)     // Catch:{ all -> 0x0414 }
            r46.advance()     // Catch:{ all -> 0x0414 }
        L_0x0233:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            int r11 = r10.dequeueOutputBuffer(r3, r0)     // Catch:{ all -> 0x0414 }
            if (r11 < 0) goto L_0x03b3
            long r0 = r3.presentationTimeUs     // Catch:{ all -> 0x0414 }
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 < 0) goto L_0x03b0
            if (r22 != 0) goto L_0x032e
            java.lang.String r1 = r29.getName()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "OMX.google"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x0266
            r0 = r32
            boolean r0 = r4.containsKey(r0)     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x0266
            r0 = r32
            int r1 = r4.getInteger(r0)     // Catch:{ all -> 0x0414 }
            r0 = 24
            r20 = 1
            if (r1 == r0) goto L_0x0268
        L_0x0266:
            r20 = 0
        L_0x0268:
            r0 = r33
            int r14 = r4.getInteger(r0)     // Catch:{ all -> 0x0414 }
            r0 = r34
            int r13 = r4.getInteger(r0)     // Catch:{ all -> 0x0414 }
            r0 = r35
            boolean r0 = r4.containsKey(r0)     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x02a8
            r0 = r35
            int r12 = r4.getInteger(r0)     // Catch:{ all -> 0x0414 }
        L_0x0282:
            r0 = r28
            android.media.MediaFormat r1 = android.media.MediaFormat.createAudioFormat(r0, r14, r13)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "bitrate"
            r15 = r47
            r1.setInteger(r0, r15)     // Catch:{ all -> 0x0414 }
            r0 = r33
            r1.setInteger(r0, r14)     // Catch:{ all -> 0x0414 }
            r0 = r34
            r1.setInteger(r0, r13)     // Catch:{ all -> 0x0414 }
            java.lang.String r13 = "aac-profile"
            r0 = 2
            r1.setInteger(r13, r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r13 = "max-input-size"
            r0 = 64000(0xfa00, float:8.9683E-41)
            r1.setInteger(r13, r0)     // Catch:{ all -> 0x0414 }
            goto L_0x02aa
        L_0x02a8:
            r12 = 0
            goto L_0x0282
        L_0x02aa:
            if (r12 == 0) goto L_0x02b1
            r0 = r35
            r1.setInteger(r0, r12)     // Catch:{ all -> 0x0414 }
        L_0x02b1:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "audiotranscoder/configuring encoder with output format "
            X.C17900vP.A0Y(r1, r0, r12)     // Catch:{ all -> 0x0414 }
            r12 = 0
            r0 = r27
            r9.configure(r1, r12, r12, r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "audiotranscoder/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0414 }
            r0 = r33
            int r13 = r4.getInteger(r0)     // Catch:{ all -> 0x0414 }
            r0 = r34
            int r12 = r4.getInteger(r0)     // Catch:{ all -> 0x0414 }
            r0 = -1
            r2[r6] = r0     // Catch:{ all -> 0x0414 }
            r0 = -15
            r2[r27] = r0     // Catch:{ all -> 0x0414 }
            r1 = 0
        L_0x02d9:
            int[] r14 = X.DPV.A07     // Catch:{ all -> 0x0414 }
            r0 = 12
            if (r1 >= r0) goto L_0x02e6
            r0 = r14[r1]     // Catch:{ all -> 0x0414 }
            if (r13 == r0) goto L_0x02f8
            int r1 = r1 + 1
            goto L_0x02d9
        L_0x02e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "audiotranscoder/sampling rate "
            r1.append(r0)     // Catch:{ all -> 0x0414 }
            r1.append(r13)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = " bps is not supported"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0414 }
            r1 = 0
        L_0x02f8:
            byte r0 = (byte) r1     // Catch:{ all -> 0x0414 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0414 }
            r12 = 2
            r1 = 64
            r2[r12] = r1     // Catch:{ all -> 0x0414 }
            int r0 = r0 << r12
            r0 = r0 | 64
            byte r1 = (byte) r0     // Catch:{ all -> 0x0414 }
            r2[r12] = r1     // Catch:{ all -> 0x0414 }
            int r0 = r13 >> 2
            X.BE6.A1N(r2, r1, r0, r12)     // Catch:{ all -> 0x0414 }
            r12 = 3
            r0 = r13 & 3
            r1 = 6
            int r0 = r0 << r1
            byte r0 = (byte) r0     // Catch:{ all -> 0x0414 }
            r2[r12] = r0     // Catch:{ all -> 0x0414 }
            r0 = 4
            r2[r0] = r6     // Catch:{ all -> 0x0414 }
            r0 = 5
            r2[r0] = r6     // Catch:{ all -> 0x0414 }
            r0 = -4
            r2[r1] = r0     // Catch:{ all -> 0x0414 }
            r9.start()     // Catch:{ all -> 0x0414 }
            java.nio.ByteBuffer[] r19 = r9.getInputBuffers()     // Catch:{ all -> 0x0414 }
            java.nio.ByteBuffer[] r0 = r9.getOutputBuffers()     // Catch:{ all -> 0x0414 }
            r5.A02 = r0     // Catch:{ all -> 0x0414 }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r22 = 1
            goto L_0x0331
        L_0x032e:
            r0 = 1000000(0xf4240, double:4.940656E-318)
        L_0x0331:
            int r13 = r9.dequeueInputBuffer(r0)     // Catch:{ all -> 0x0414 }
            r14 = -1
        L_0x0336:
            if (r13 != r14) goto L_0x0344
            r13 = r30
            r12 = r24
            X.DPV.A00(r12, r9, r5, r13, r2)     // Catch:{ all -> 0x0414 }
            int r13 = r9.dequeueInputBuffer(r0)     // Catch:{ all -> 0x0414 }
            goto L_0x0336
        L_0x0344:
            if (r13 < 0) goto L_0x03d2
            r12 = r19[r13]     // Catch:{ all -> 0x0414 }
            r14 = r25[r11]     // Catch:{ all -> 0x0414 }
            X.BEA.A15(r3, r14)     // Catch:{ all -> 0x0414 }
            r12.clear()     // Catch:{ all -> 0x0414 }
            if (r20 == 0) goto L_0x036e
            r15 = 0
        L_0x0353:
            boolean r0 = r14.hasRemaining()     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x0367
            byte r1 = r14.get()     // Catch:{ all -> 0x0414 }
            int r0 = r15 % 3
            if (r0 == 0) goto L_0x0364
            r12.put(r1)     // Catch:{ all -> 0x0414 }
        L_0x0364:
            int r15 = r15 + 1
            goto L_0x0353
        L_0x0367:
            int r0 = r3.size     // Catch:{ all -> 0x0414 }
            int r0 = r0 * 2
            int r15 = r0 / 3
            goto L_0x0373
        L_0x036e:
            r12.put(r14)     // Catch:{ all -> 0x0414 }
            int r15 = r3.size     // Catch:{ all -> 0x0414 }
        L_0x0373:
            long r0 = r3.presentationTimeUs     // Catch:{ all -> 0x0414 }
            int r12 = r3.flags     // Catch:{ all -> 0x0414 }
            r38 = r9
            r39 = r13
            r40 = r6
            r41 = r15
            r42 = r0
            r44 = r12
            r38.queueInputBuffer(r39, r40, r41, r42, r44)     // Catch:{ all -> 0x0414 }
            X.BEA.A15(r3, r14)     // Catch:{ all -> 0x0414 }
            r12 = 0
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x03d2
            X.E6f r0 = r5.A01     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x03d2
            long r0 = r3.presentationTimeUs     // Catch:{ all -> 0x0414 }
            r12 = 100
            long r0 = r0 * r12
            long r0 = r0 / r16
            int r12 = (int) r0     // Catch:{ all -> 0x0414 }
            r0 = r23
            if (r12 == r0) goto L_0x03d2
            boolean r0 = r5.A06     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x03aa
            X.E6f r0 = r5.A01     // Catch:{ all -> 0x0414 }
            r0.C22(r12)     // Catch:{ all -> 0x0414 }
            r0 = 0
            goto L_0x03ab
        L_0x03aa:
            r0 = 1
        L_0x03ab:
            r5.A06 = r0     // Catch:{ all -> 0x0414 }
            r23 = r12
            goto L_0x03d2
        L_0x03b0:
            int r21 = r21 + 1
            goto L_0x03d9
        L_0x03b3:
            r0 = -3
            if (r11 != r0) goto L_0x03bd
            java.nio.ByteBuffer[] r25 = r10.getOutputBuffers()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "audiotranscoder/decoder output buffers have changed."
            goto L_0x03ce
        L_0x03bd:
            r0 = -2
            if (r11 != r0) goto L_0x03dc
            android.media.MediaFormat r4 = r10.getOutputFormat()     // Catch:{ all -> 0x0414 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "audiotranscoder/decoder output format has changed to "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ all -> 0x0414 }
        L_0x03ce:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0414 }
            goto L_0x03dc
        L_0x03d2:
            r1 = r30
            r0 = r24
            X.DPV.A00(r0, r9, r5, r1, r2)     // Catch:{ all -> 0x0414 }
        L_0x03d9:
            r10.releaseOutputBuffer(r11, r6)     // Catch:{ all -> 0x0414 }
        L_0x03dc:
            int r0 = r3.flags     // Catch:{ all -> 0x0414 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01f1
            java.lang.String r0 = "audiotranscoder/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0414 }
        L_0x03e7:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "audiotranscoder/processed frames:"
            r2.append(r0)     // Catch:{ all -> 0x0414 }
            int r0 = r5.A00     // Catch:{ all -> 0x0414 }
            r2.append(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r1 = " skipped:"
            r0 = r21
            X.C17900vP.A0j(r1, r2, r0)     // Catch:{ all -> 0x0414 }
            r10.stop()     // Catch:{ all -> 0x0458 }
            r10.release()     // Catch:{ all -> 0x0458 }
            if (r22 == 0) goto L_0x0407
            r9.stop()     // Catch:{ all -> 0x0458 }
        L_0x0407:
            r9.release()     // Catch:{ all -> 0x0458 }
            r46.release()     // Catch:{ all -> 0x0458 }
            if (r30 == 0) goto L_0x04b7
            r30.close()     // Catch:{ all -> 0x0464 }
            goto L_0x04b7
        L_0x0414:
            r1 = move-exception
            r10.stop()     // Catch:{ all -> 0x0458 }
            r10.release()     // Catch:{ all -> 0x0458 }
            if (r22 == 0) goto L_0x0420
            r9.stop()     // Catch:{ all -> 0x0458 }
        L_0x0420:
            r9.release()     // Catch:{ all -> 0x0458 }
            r46.release()     // Catch:{ all -> 0x0458 }
            goto L_0x0457
        L_0x0427:
            r1 = move-exception
            java.lang.String r0 = X.C17900vP.A0A(r2, r9)     // Catch:{ all -> 0x0458 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0458 }
            r46.release()     // Catch:{ all -> 0x0458 }
            X.Bw7 r1 = new X.Bw7     // Catch:{ all -> 0x0458 }
            r1.<init>()     // Catch:{ all -> 0x0458 }
            goto L_0x0457
        L_0x0438:
            java.lang.String r0 = "audiotranscoder/ no codec supporting audio/mp4a-latm"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0458 }
            r46.release()     // Catch:{ all -> 0x0458 }
            java.lang.String r0 = "No codec supporting audio/mp4a-latm"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0458 }
            r1.<init>(r0)     // Catch:{ all -> 0x0458 }
            goto L_0x0457
        L_0x0448:
            java.lang.String r0 = X.C17900vP.A0A(r2, r9)     // Catch:{ all -> 0x0458 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0458 }
            r46.release()     // Catch:{ all -> 0x0458 }
            X.Bw7 r1 = new X.Bw7     // Catch:{ all -> 0x0458 }
            r1.<init>()     // Catch:{ all -> 0x0458 }
        L_0x0457:
            throw r1     // Catch:{ all -> 0x0458 }
        L_0x0458:
            r1 = move-exception
            if (r30 == 0) goto L_0x0463
            r30.close()     // Catch:{ all -> 0x045f }
            goto L_0x0463
        L_0x045f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0464 }
        L_0x0463:
            throw r1     // Catch:{ all -> 0x0464 }
        L_0x0464:
            r1 = move-exception
            r31.close()     // Catch:{ all -> 0x0469 }
            goto L_0x046d
        L_0x0469:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
        L_0x046d:
            throw r1     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
        L_0x046e:
            java.lang.String r0 = "audiotranscoder/no audio tracks"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r46.release()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            goto L_0x04d4
        L_0x0477:
            java.lang.String r0 = "mediatranscodequeue/audio/cannot-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "cannot transcode audio"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            goto L_0x04e4
        L_0x0483:
            X.1SO r0 = r7.A04     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            boolean r0 = r0.A0F(r2)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            if (r0 == 0) goto L_0x04ad
            java.lang.String r0 = "mediatranscodequeue/audio/copy-and-repair"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.17r r0 = r7.A02     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0.A0i(r2, r8)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.1SP r0 = X.AnonymousClass1SO.A04(r8)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            int r1 = r0.A01     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r0 = 2
            if (r1 != r0) goto L_0x04e5
            com.whatsapp.media.WamediaManager r0 = r7.A03     // Catch:{ 2RS -> 0x04a4, IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee }
            r0.check(r8, r6)     // Catch:{ 2RS -> 0x04a4, IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee }
            goto L_0x04e5
        L_0x04a4:
            r2 = move-exception
            com.whatsapp.media.WamediaManager r1 = r7.A03     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "check audio on upload"
            r1.uploadMp4FailureLogs(r8, r2, r0, r6)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            goto L_0x04e4
        L_0x04ad:
            java.lang.String r0 = "mediatranscodequeue/audio/ineligible-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r37)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            goto L_0x04e4
        L_0x04b7:
            r31.close()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = "audiotranscoder finished cancelled:"
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            boolean r0 = r5.A06     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            java.lang.String r0 = " output:"
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            long r0 = r45.length()     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            X.C17890vO.A16(r2, r0)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
        L_0x04d4:
            boolean r0 = r5.A06     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            if (r0 != 0) goto L_0x0535
            X.1SO r0 = r7.A04     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            boolean r0 = r0.A0F(r8)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
            if (r0 != 0) goto L_0x04e5
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r37)     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
        L_0x04e4:
            throw r2     // Catch:{ IllegalArgumentException -> 0x051e, IllegalStateException -> 0x0517, Bw7 -> 0x050d, FileNotFoundException -> 0x0503, IOException -> 0x04ee, 2RS -> 0x04e7 }
        L_0x04e5:
            r0 = 1
            goto L_0x0536
        L_0x04e7:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0554 }
            goto L_0x0513
        L_0x04ee:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0554 }
            if (r1 == 0) goto L_0x0524
            java.lang.String r0 = "No space"
            boolean r2 = X.AnonymousClass1YF.A0Y(r1, r0, r6)     // Catch:{ all -> 0x0554 }
            r1 = 2131889993(0x7f120f49, float:1.9414665E38)
            r0 = r27
            if (r2 == r0) goto L_0x0527
            goto L_0x0524
        L_0x0503:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0554 }
            r1 = 2131889979(0x7f120f3b, float:1.9414637E38)
            goto L_0x0527
        L_0x050d:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/badaudio"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0554 }
        L_0x0513:
            r1 = 2131889958(0x7f120f26, float:1.9414594E38)
            goto L_0x0527
        L_0x0517:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0554 }
            goto L_0x0524
        L_0x051e:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0554 }
        L_0x0524:
            r1 = 2131890005(0x7f120f55, float:1.941469E38)
        L_0x0527:
            r0 = r48
            X.E6h r0 = r0.A05     // Catch:{ all -> 0x0554 }
            r0.BJ0(r1)     // Catch:{ all -> 0x0554 }
            android.os.PowerManager$WakeLock r0 = r7.A01
            X.C27086DTl.A04(r0)
            r0 = 0
            goto L_0x0539
        L_0x0535:
            r0 = 0
        L_0x0536:
            X.C27086DTl.A04(r36)
        L_0x0539:
            X.CX7 r1 = new X.CX7
            r1.<init>()
            if (r0 == 0) goto L_0x0551
            int r0 = X.C26511Sk.A03(r8)
            r1.A00 = r0
            r1.A01 = r8
            r0 = r27
            r1.A04 = r0
        L_0x054c:
            X.Bu3 r0 = r1.A00()
            return r0
        L_0x0551:
            r1.A04 = r6
            goto L_0x054c
        L_0x0554:
            r1 = move-exception
            android.os.PowerManager$WakeLock r0 = r7.A01
            X.C27086DTl.A04(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24018Bu4.A07():X.2fe");
    }
}
