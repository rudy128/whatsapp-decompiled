package X;

import android.os.SystemClock;
import com.facebook.wearable.mediastream.client.state.MediaStreamServiceStateDelegate$handleFrameStallTimeout$1;
import com.meta.media.stream.proto.ConfigureAudioStreamResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.Dlp  reason: case insensitive filesystem */
public final class C27813Dlp extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25527ChP $buffer;
    public final /* synthetic */ BXL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27813Dlp(C25527ChP chP, BXL bxl) {
        super(0);
        this.$buffer = chP;
        this.this$0 = bxl;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22821Di r1;
        Object obj;
        ByteBuffer byteBuffer;
        BXL bxl;
        int i;
        C23636Bn5 bn5;
        C25845Cn1 cn1;
        BXL bxl2;
        C23644BnD bnD;
        Integer num;
        byte[] bArr;
        C22821Di r2;
        Object bWj;
        C24378C0x c0x;
        C24380C0z c0z;
        int i2;
        C22821Di r22;
        C0t c0t;
        Object bWl;
        Object obj2;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        Object obj3;
        C15 c15;
        C24379C0y c0y;
        Object obj4;
        Throwable dZl;
        C24375C0s c0s;
        C25527ChP chP = this.$buffer;
        int i3 = chP.A01;
        boolean z = true;
        if (i3 == 1) {
            C25845Cn1 cn12 = C24712CGy.A01;
            cn12.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CODEC_CONFIGURATION_UPDATE_REQUEST");
            C23641BnA bnA = (C23641BnA) C23577Bm6.A06(C23641BnA.DEFAULT_INSTANCE, this.$buffer.A00);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bnA.config_.A02());
            C23581BmB bmB = (C23581BmB) bnA.config_;
            allocateDirect.put(bmB.bytes, bmB.A07(), bmB.A02());
            allocateDirect.flip();
            int i4 = bnA.type_;
            if (i4 == 0) {
                c0s = C24375C0s.CODEC_TYPE_NONE;
            } else if (i4 == 1) {
                c0s = C24375C0s.CODEC_TYPE_AUDIO;
            } else if (i4 != 2) {
                c0s = C24375C0s.UNRECOGNIZED;
            } else {
                c0s = C24375C0s.CODEC_TYPE_VIDEO;
            }
            int ordinal = c0s.ordinal();
            if (ordinal == 1) {
                BXL bxl3 = this.this$0;
                if (allocateDirect.isDirect()) {
                    r1 = bxl3.A00.A0M;
                    obj = new C22938BWg(allocateDirect);
                } else {
                    throw AnonymousClass000.A0k("Buffer must be direct");
                }
            } else if (ordinal != 2) {
                cn12.A04(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received codec configuration update with unrecognized type!", (Throwable) null);
            } else {
                BXL bxl4 = this.this$0;
                if (allocateDirect.isDirect()) {
                    r1 = bxl4.A00.A0M;
                    obj = new BWo(allocateDirect);
                } else {
                    throw AnonymousClass000.A0k("Buffer must be direct");
                }
            }
            r1.invoke(obj);
        } else {
            if (i3 == 4) {
                C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONFIGURE_AUDIO_STREAM_RESPONSE");
                ConfigureAudioStreamResponse parseFrom = ConfigureAudioStreamResponse.parseFrom(this.$buffer.A00);
                bxl = this.this$0;
                i = parseFrom.getNonce();
                bn5 = parseFrom.getError();
            } else {
                if (i3 == 6) {
                    C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONFIGURE_VIDEO_STREAM_RESPONSE");
                    C23632Bn1 bn1 = (C23632Bn1) C23577Bm6.A06(C23632Bn1.DEFAULT_INSTANCE, this.$buffer.A00);
                    bxl = this.this$0;
                    i = bn1.nonce_;
                    bn5 = bn1.error_;
                } else if (i3 == 8) {
                    C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONTROL_STREAM_RESPONSE");
                    C23634Bn3 bn3 = (C23634Bn3) C23577Bm6.A06(C23634Bn3.DEFAULT_INSTANCE, this.$buffer.A00);
                    bxl = this.this$0;
                    i = bn3.nonce_;
                    bn5 = bn3.error_;
                } else {
                    if (i3 == 13) {
                        C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONTROL_STREAM_STOPPED");
                        AnonymousClass1OB r12 = this.this$0.A00.A00.A0E;
                        if (r12 != null) {
                            r12.BEM((CancellationException) null);
                        }
                        r22 = this.this$0.A00.A0L;
                        switch (((C23635Bn4) C23577Bm6.A06(C23635Bn4.DEFAULT_INSTANCE, this.$buffer.A00)).reason_) {
                            case 0:
                                c15 = C15.STREAM_STOPPED_REASON_UNKNOWN;
                                break;
                            case 1:
                                c15 = C15.STREAM_STOPPED_REASON_USER_INITIATED;
                                break;
                            case 2:
                                c15 = C15.STREAM_STOPPED_REASON_SYSTEM_PREEMPT;
                                break;
                            case 3:
                                c15 = C15.STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN;
                                break;
                            case 4:
                                c15 = C15.STREAM_STOPPED_REASON_BATTERY_LOW;
                                break;
                            case 5:
                                c15 = C15.STREAM_STOPPED_REASON_THERMAL_THRESHOLD;
                                break;
                            case 6:
                                c15 = C15.STREAM_STOPPED_REASON_INACTIVITY;
                                break;
                            case 7:
                                c15 = C15.STREAM_STOPPED_REASON_CAMERA_FAILURE;
                                break;
                            case 8:
                                c15 = C15.STREAM_STOPPED_REASON_DOFF;
                                break;
                            case 9:
                                c15 = C15.STREAM_STOPPED_REASON_CLOSE_ARMS;
                                break;
                            case 10:
                                c15 = C15.STREAM_STOPPED_REASON_AUDIO_FAILURE;
                                break;
                            case 11:
                                c15 = C15.STREAM_STOPPED_REASON_MOBILE_STREAM_ERROR;
                                break;
                            case 12:
                                c15 = C15.STREAM_STOPPED_REASON_PEAK_POWER_INTERRUPT;
                                break;
                            case 13:
                                c15 = C15.STREAM_STOPPED_REASON_USER_PAUSE;
                                break;
                            case 14:
                                c15 = C15.STREAM_STOPPED_REASON_TAMPER_DETECTED;
                                break;
                            case 15:
                                c15 = C15.STREAM_STOPPED_REASON_HARDWARE_TOGGLE;
                                break;
                            case 16:
                                c15 = C15.STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN_BATTERY;
                                break;
                            case 17:
                                c15 = C15.STREAM_STOPPED_REASON_FRAME_INITIATED;
                                break;
                            case 18:
                                c15 = C15.STREAM_STOPPED_REASON_CLIENT_PREEMPT;
                                break;
                            case 19:
                                c15 = C15.STREAM_STOPPED_REASON_VERSION_NOT_SUPPORTED;
                                break;
                            case 20:
                                c15 = C15.STREAM_STOPPED_REASON_CLIENT_INITIATED;
                                break;
                            case 21:
                                c15 = C15.STREAM_STOPPED_REASON_COMPANION_DEVICE_REQUESTED_SERVICE_STOP;
                                break;
                            case 22:
                                c15 = C15.STREAM_STOPPED_REASON_WEAK_SIGNAL;
                                break;
                            default:
                                c15 = C15.UNRECOGNIZED;
                                break;
                        }
                        bWl = new BWR(c15.ordinal());
                    } else {
                        if (i3 == 9) {
                            byteBuffer2 = chP.A00;
                            if (byteBuffer2 != null) {
                                BXL bxl5 = this.this$0;
                                int remaining = bxl5.A00.A00.A07.remaining();
                                int remaining2 = byteBuffer2.remaining();
                                BQm bQm = bxl5.A00;
                                if (remaining >= remaining2) {
                                    byteBuffer3 = bQm.A00.A07;
                                } else {
                                    C25258Cbx cbx = bQm.A00;
                                    cbx.A07 = BXL.A00(cbx.A07, byteBuffer2);
                                }
                            }
                        } else {
                            if (i3 == 11) {
                                ByteBuffer byteBuffer4 = chP.A00;
                                if (byteBuffer4 != null) {
                                    BXL bxl6 = this.this$0;
                                    int remaining3 = bxl6.A00.A00.A07.remaining();
                                    int remaining4 = byteBuffer4.remaining();
                                    BQm bQm2 = bxl6.A00;
                                    if (remaining3 >= remaining4) {
                                        bQm2.A00.A07.put(byteBuffer4);
                                    } else {
                                        C25258Cbx cbx2 = bQm2.A00;
                                        cbx2.A07 = BXL.A00(cbx2.A07, byteBuffer4);
                                    }
                                }
                                this.this$0.A00.A00.A07.flip();
                                BXL bxl7 = this.this$0;
                                ByteBuffer byteBuffer5 = bxl7.A00.A00.A07;
                                try {
                                    byteBuffer5.order(ByteOrder.LITTLE_ENDIAN);
                                    obj3 = new BTB(byteBuffer5, byteBuffer5.getLong());
                                } catch (Throwable th) {
                                    obj3 = C108945cZ.A1J(th);
                                }
                                C30691eM.A01(obj3);
                                BTB btb = (BTB) obj3;
                                BQm bQm3 = bxl7.A00;
                                C24868CNm cNm = bQm3.A0H;
                                if (cNm != null) {
                                    long j = btb.A00;
                                    Long l = cNm.A00;
                                    if (l == null) {
                                        l = C108945cZ.A1B(C17880vN.A04(SystemClock.elapsedRealtimeNanos()), j);
                                    }
                                    cNm.A00 = l;
                                    if (l != null) {
                                        j += l.longValue();
                                    }
                                    btb.A00 = j;
                                }
                                C22821Di r4 = bQm3.A0M;
                                ByteBuffer asReadOnlyBuffer = btb.A01.asReadOnlyBuffer();
                                C18070vi.A0X(asReadOnlyBuffer);
                                r4.invoke(new BWp(asReadOnlyBuffer, btb.A00));
                                byteBuffer = this.this$0.A00.A00.A07;
                            } else if (i3 == 10) {
                                byteBuffer2 = chP.A00;
                                if (byteBuffer2 != null) {
                                    BXL bxl8 = this.this$0;
                                    int remaining5 = bxl8.A00.A00.A08.remaining();
                                    int remaining6 = byteBuffer2.remaining();
                                    BQm bQm4 = bxl8.A00;
                                    if (remaining5 >= remaining6) {
                                        byteBuffer3 = bQm4.A00.A08;
                                    } else {
                                        C25258Cbx cbx3 = bQm4.A00;
                                        cbx3.A08 = BXL.A00(cbx3.A08, byteBuffer2);
                                    }
                                }
                            } else if (i3 == 12) {
                                ByteBuffer byteBuffer6 = chP.A00;
                                if (byteBuffer6 != null) {
                                    BXL bxl9 = this.this$0;
                                    int remaining7 = bxl9.A00.A00.A08.remaining();
                                    int remaining8 = byteBuffer6.remaining();
                                    BQm bQm5 = bxl9.A00;
                                    if (remaining7 >= remaining8) {
                                        bQm5.A00.A08.put(byteBuffer6);
                                    } else {
                                        C25258Cbx cbx4 = bQm5.A00;
                                        cbx4.A08 = BXL.A00(cbx4.A08, byteBuffer6);
                                    }
                                }
                                this.this$0.A00.A00.A08.flip();
                                BXL bxl10 = this.this$0;
                                ByteBuffer byteBuffer7 = bxl10.A00.A00.A08;
                                try {
                                    byteBuffer7.order(ByteOrder.LITTLE_ENDIAN);
                                    obj2 = new BTB(byteBuffer7, byteBuffer7.getLong());
                                } catch (Throwable th2) {
                                    obj2 = C108945cZ.A1J(th2);
                                }
                                C30691eM.A01(obj2);
                                BTB btb2 = (BTB) obj2;
                                BQm bQm6 = bxl10.A00;
                                C24868CNm cNm2 = bQm6.A0H;
                                if (cNm2 != null) {
                                    long j2 = btb2.A00;
                                    Long l2 = cNm2.A01;
                                    if (l2 == null) {
                                        l2 = C108945cZ.A1B(C17880vN.A04(SystemClock.elapsedRealtimeNanos()), j2);
                                    }
                                    cNm2.A01 = l2;
                                    if (l2 != null) {
                                        j2 += l2.longValue();
                                    }
                                    btb2.A00 = j2;
                                }
                                C25258Cbx cbx5 = bQm6.A00;
                                AnonymousClass1OB r13 = cbx5.A0E;
                                if (r13 != null) {
                                    r13.BEM((CancellationException) null);
                                }
                                C6B A03 = bQm6.A03();
                                C18070vi.A0X(A03);
                                if (A03.equals(bQm6.A0A())) {
                                    cbx5.A0E = AnonymousClass3MY.A0s(new MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(bxl10, (C30391dr) null), BE6.A18());
                                }
                                C22821Di r42 = bQm6.A0M;
                                ByteBuffer asReadOnlyBuffer2 = btb2.A01.asReadOnlyBuffer();
                                C18070vi.A0X(asReadOnlyBuffer2);
                                r42.invoke(new C22944BWq(asReadOnlyBuffer2, btb2.A00));
                                byteBuffer = this.this$0.A00.A00.A08;
                            } else if (i3 == 22) {
                                C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_SUPPORTED_CONFIGURATION_UPDATE_REQUEST");
                                r22 = this.this$0.A00.A0M;
                                int i5 = ((C23637Bn6) C23577Bm6.A06(C23637Bn6.DEFAULT_INSTANCE, this.$buffer.A00)).videoQuality_;
                                if (i5 == 0) {
                                    c0t = C0t.VIDEO_QUALITY_LOW;
                                } else if (i5 == 1) {
                                    c0t = C0t.VIDEO_QUALITY_MEDIUM;
                                } else if (i5 != 2) {
                                    c0t = C0t.UNRECOGNIZED;
                                } else {
                                    c0t = C0t.VIDEO_QUALITY_HIGH;
                                }
                                bWl = new C22943BWl(c0t.ordinal());
                            } else {
                                if (i3 == 25) {
                                    C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_STREAM_TELEMETRY_EVENT");
                                    ByteBuffer byteBuffer8 = this.$buffer.A00;
                                    if (byteBuffer8 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        bWj = new C22942BWk(byteBuffer8);
                                    }
                                } else if (i3 == 21) {
                                    C25845Cn1 cn13 = C24712CGy.A01;
                                    cn13.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_SYSTEM_HEALTH_EVENT");
                                    ByteBuffer byteBuffer9 = this.$buffer.A00;
                                    if (byteBuffer9 != null) {
                                        BXL bxl11 = this.this$0;
                                        C23645BnE bnE = (C23645BnE) C23577Bm6.A06(C23645BnE.DEFAULT_INSTANCE, byteBuffer9);
                                        int i6 = bnE.type_;
                                        if (i6 == 0) {
                                            c0x = C24378C0x.SystemHealthEventTypeUnknown;
                                        } else if (i6 == 1) {
                                            c0x = C24378C0x.Connectivity;
                                        } else if (i6 == 2) {
                                            c0x = C24378C0x.Battery;
                                        } else if (i6 == 3) {
                                            c0x = C24378C0x.Thermal;
                                        } else if (i6 != 4) {
                                            c0x = C24378C0x.UNRECOGNIZED;
                                        } else {
                                            c0x = C24378C0x.PeakPower;
                                        }
                                        if (c0x == C24378C0x.PeakPower) {
                                            String A09 = bxl11.A09();
                                            cn13.A02(A09, "[MEDIA_STREAM_SERVICE] Handle peak power event");
                                            BQm bQm7 = bxl11.A00;
                                            C26153CtL ctL = BQm.A0Q;
                                            CXV A032 = ctL.A03();
                                            if (A032 != null) {
                                                int i7 = bnE.status_;
                                                if (i7 == 0) {
                                                    c0z = C24380C0z.Unknown;
                                                } else if (i7 == 1) {
                                                    c0z = C24380C0z.Critical;
                                                } else if (i7 == 2) {
                                                    c0z = C24380C0z.PreCritical;
                                                } else if (i7 == 3) {
                                                    c0z = C24380C0z.Warning;
                                                } else if (i7 == 4) {
                                                    c0z = C24380C0z.Normal;
                                                } else if (i7 != 5) {
                                                    c0z = C24380C0z.UNRECOGNIZED;
                                                } else {
                                                    c0z = C24380C0z.Ideal;
                                                }
                                                int ordinal2 = c0z.ordinal();
                                                if (ordinal2 == 5) {
                                                    i2 = 10;
                                                } else if (ordinal2 == 4) {
                                                    i2 = 11;
                                                } else if (ordinal2 == 3) {
                                                    i2 = 12;
                                                } else if (ordinal2 != 2) {
                                                    i2 = 14;
                                                    if (ordinal2 != 1) {
                                                        i2 = 15;
                                                    }
                                                } else {
                                                    i2 = 13;
                                                }
                                                cn13.A02(A09, AnonymousClass001.A1I("[MEDIA_STREAM_SERVICE] Update device peak power to ", AnonymousClass000.A10(), i2));
                                                String A00 = A032.A00();
                                                Integer valueOf = Integer.valueOf(i2);
                                                C26153CtL.A01(ctL, valueOf, A00, 4, true);
                                                bQm7.A0K.invoke(valueOf);
                                            }
                                        } else {
                                            r2 = bxl11.A00.A0M;
                                            bWj = new BWm(byteBuffer9);
                                        }
                                    }
                                } else if (i3 == 23) {
                                    C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_USER_EVENT_NOTIFICATION");
                                    ByteBuffer byteBuffer10 = this.$buffer.A00;
                                    if (byteBuffer10 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        bWj = new BWn(byteBuffer10);
                                    }
                                } else if (i3 == 17) {
                                    C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_USER_ENGAGEMENT_REQUEST");
                                    ByteBuffer byteBuffer11 = this.$buffer.A00;
                                    if (byteBuffer11 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        bWj = new C22939BWh(byteBuffer11);
                                    }
                                } else if (i3 == 31) {
                                    C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_MODEL_REQUEST");
                                    ByteBuffer byteBuffer12 = this.$buffer.A00;
                                    if (byteBuffer12 != null) {
                                        r2 = this.this$0.A00.A0M;
                                        bWj = new C22941BWj(byteBuffer12);
                                    }
                                } else {
                                    if (i3 == 36) {
                                        cn1 = C24712CGy.A01;
                                        cn1.A03(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_METADATA_CAST_BUFFER");
                                        ByteBuffer byteBuffer13 = this.$buffer.A00;
                                        if (byteBuffer13 != null) {
                                            bxl2 = this.this$0;
                                            bnD = (C23644BnD) C23577Bm6.A06(C23644BnD.DEFAULT_INSTANCE, byteBuffer13);
                                            C18070vi.A0b(bnD);
                                            z = false;
                                        }
                                    } else if (i3 == 37) {
                                        cn1 = C24712CGy.A01;
                                        cn1.A03(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_METADATA_CAST_BUFFER_END");
                                        ByteBuffer byteBuffer14 = this.$buffer.A00;
                                        if (byteBuffer14 != null) {
                                            bxl2 = this.this$0;
                                            bnD = (C23644BnD) C23577Bm6.A06(C23644BnD.DEFAULT_INSTANCE, byteBuffer14);
                                            C18070vi.A0b(bnD);
                                        }
                                    } else if (i3 == 39) {
                                        C24712CGy.A01.A02(this.this$0.A09(), "[MEDIA_STREAM_SERVICE] Received message type MESSAGE_TYPE_CONFIGURE_METADATA_STREAM_RESPONSE");
                                        C23642BnB bnB = (C23642BnB) C23577Bm6.A06(C23642BnB.DEFAULT_INSTANCE, this.$buffer.A00);
                                        bxl = this.this$0;
                                        i = bnB.nonce_;
                                        bn5 = bnB.error_;
                                    }
                                    BQm bQm8 = bxl2.A00;
                                    Map map = bQm8.A00.A09;
                                    boolean A1a = C108965cb.A1a(map, bnD.tag_);
                                    Integer valueOf2 = Integer.valueOf(bnD.tag_);
                                    if (A1a) {
                                        C24866CNk cNk = (C24866CNk) map.get(valueOf2);
                                        if (cNk != null) {
                                            cNk.A00 = C200310o.A0A(cNk.A00, AnonymousClass8BS.A1P(bnD.metadata_));
                                        }
                                    } else {
                                        map.put(valueOf2, new C24866CNk(AnonymousClass8BS.A1P(bnD.metadata_), bnD.presentationTimeUs_));
                                    }
                                    if (z) {
                                        C24866CNk cNk2 = (C24866CNk) AnonymousClass000.A0w(map, bnD.tag_);
                                        String A092 = bxl2.A09();
                                        StringBuilder A10 = AnonymousClass000.A10();
                                        A10.append("[MEDIA_STREAM_SERVICE] metadata size ");
                                        Long l3 = null;
                                        if (cNk2 == null || (bArr = cNk2.A00) == null) {
                                            num = null;
                                        } else {
                                            num = Integer.valueOf(bArr.length);
                                        }
                                        A10.append(num);
                                        A10.append(" tag: ");
                                        A10.append(bnD.tag_);
                                        A10.append(", time: ");
                                        if (cNk2 != null) {
                                            l3 = Long.valueOf(cNk2.A01);
                                        }
                                        cn1.A03(A092, C17890vO.A0V(l3, A10));
                                        map.remove(Integer.valueOf(bnD.tag_));
                                        if (cNk2 != null) {
                                            r1 = bQm8.A0M;
                                            obj = new C22940BWi(cNk2);
                                            r1.invoke(obj);
                                        }
                                    }
                                }
                                r2.invoke(bWj);
                            }
                            byteBuffer.clear();
                        }
                        byteBuffer3.put(byteBuffer2);
                    }
                    r22.invoke(bWl);
                }
                if (bn5 == null) {
                    bn5 = C23636Bn5.DEFAULT_INSTANCE;
                }
            }
            C18070vi.A0X(bn5);
            C22821Di r43 = (C22821Di) bxl.A00.A00.A0F.remove(Integer.valueOf(i));
            if (r43 != null) {
                int i8 = bn5.code_;
                if (i8 == 0) {
                    c0y = C24379C0y.ERROR_CODE_SUCCESS;
                } else if (i8 == 1) {
                    c0y = C24379C0y.ERROR_CODE_INTERNAL;
                } else if (i8 == 2) {
                    c0y = C24379C0y.ERROR_CODE_INVALID_PARAMETER;
                } else if (i8 == 3) {
                    c0y = C24379C0y.ERROR_CODE_UNSUPPORTED_PARAMETER;
                } else if (i8 == 4) {
                    c0y = C24379C0y.ERROR_CODE_DOFF;
                } else if (i8 != 5) {
                    c0y = C24379C0y.UNRECOGNIZED;
                } else {
                    c0y = C24379C0y.ERROR_CODE_BUSY;
                }
                int ordinal3 = c0y.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        dZl = new C27211DZl(bn5.reason_);
                    } else if (ordinal3 == 2) {
                        obj4 = new C22934BWc(new C27211DZl(bn5.reason_));
                    } else if (ordinal3 == 3) {
                        obj4 = new C22935BWd(new C27211DZl(bn5.reason_));
                    } else if (ordinal3 != 4) {
                        dZl = new C27212DZm();
                    } else {
                        obj4 = new C22932BWa(new C27211DZl(bn5.reason_));
                    }
                    obj4 = new C22933BWb(dZl);
                } else {
                    obj4 = C22936BWe.A00;
                }
                r43.invoke(obj4);
            }
        }
        return C27621Wu.A00;
    }
}
