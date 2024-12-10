package com.whatsapp.logging.messaging;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1Y7;
import X.AnonymousClass1YE;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C18090vk;
import X.C18600wl;
import X.C25441Of;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C52282af;
import X.C81823zr;
import X.C85854Oz;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$logAction$queueingResult$1", f = "MessagingFunnelLoggerImpl.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class MessagingFunnelLoggerImpl$logAction$queueingResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C85854Oz $builder;
    public final /* synthetic */ C52282af $currentChatSession;
    public int label;
    public final /* synthetic */ C25441Of this$0;

    @DebugMetadata(c = "com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$logAction$queueingResult$1$1", f = "MessagingFunnelLoggerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$logAction$queueingResult$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C18090vk r0 = C85854Oz.this.A05;
                if (r0 != null) {
                    r0.invoke();
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagingFunnelLoggerImpl$logAction$queueingResult$1(C85854Oz r2, C52282af r3, C25441Of r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r4;
        this.$builder = r2;
        this.$currentChatSession = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MessagingFunnelLoggerImpl$logAction$queueingResult$1(this.$builder, this.$currentChatSession, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C18600wl r2 = this.this$0.A06;
            final C85854Oz r1 = this.$builder;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r2, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C85854Oz r22 = this.$builder;
        Integer num = r22.A04;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = r22.A02;
            long j = r22.A06;
            Integer num3 = r22.A01;
            Boolean bool = r22.A00;
            Integer num4 = r22.A03;
            C52282af r3 = this.$currentChatSession;
            if (r3 != null) {
                C25441Of r7 = this.this$0;
                C81823zr r62 = new C81823zr();
                r62.A07 = r3.A00.A03();
                r62.A04 = num3;
                r62.A05 = Long.valueOf(j);
                r62.A03 = num2;
                r62.A06 = (String) AnonymousClass3MX.A14(r7.A04);
                r62.A00 = bool;
                int i2 = 39;
                if (num4 == null) {
                    i2 = null;
                } else {
                    int intValue2 = num4.intValue();
                    if (intValue2 != 0) {
                        int i3 = 2;
                        if (intValue2 != 1) {
                            int i4 = 4;
                            if (intValue2 != 2) {
                                if (intValue2 != 3) {
                                    int i5 = 7;
                                    if (intValue2 != 4) {
                                        if (intValue2 == 5) {
                                            i5 = 6;
                                        } else {
                                            i4 = 10;
                                            if (intValue2 != 8) {
                                                if (intValue2 != 9) {
                                                    if (intValue2 != 10) {
                                                        int i6 = 12;
                                                        if (intValue2 != 12) {
                                                            i4 = 11;
                                                            i6 = 13;
                                                            if (intValue2 != 13) {
                                                                if (intValue2 != 14) {
                                                                    i6 = 16;
                                                                    if (intValue2 != 16) {
                                                                        if (intValue2 != 20) {
                                                                            i6 = 62;
                                                                            if (intValue2 != 23) {
                                                                                int i7 = 19;
                                                                                if (intValue2 != 26) {
                                                                                    i5 = 17;
                                                                                    if (intValue2 != 27) {
                                                                                        if (intValue2 != 28) {
                                                                                            int i8 = 29;
                                                                                            if (!(intValue2 == 29 || intValue2 == 30)) {
                                                                                                i7 = 37;
                                                                                                if (intValue2 == 37) {
                                                                                                    i5 = 22;
                                                                                                } else {
                                                                                                    int i9 = 42;
                                                                                                    i5 = 31;
                                                                                                    if (intValue2 != 42) {
                                                                                                        i5 = 32;
                                                                                                        if (intValue2 != 43) {
                                                                                                            i5 = 24;
                                                                                                            if (intValue2 != 44) {
                                                                                                                if (intValue2 != 52) {
                                                                                                                    if (intValue2 == 56) {
                                                                                                                        i5 = 34;
                                                                                                                    } else {
                                                                                                                        i8 = 58;
                                                                                                                        if (intValue2 != 58) {
                                                                                                                            i9 = 59;
                                                                                                                            if (intValue2 != 59) {
                                                                                                                                if (intValue2 != 60) {
                                                                                                                                    if (intValue2 != 61) {
                                                                                                                                        if (intValue2 != 62) {
                                                                                                                                            i3 = 63;
                                                                                                                                            if (intValue2 != 63) {
                                                                                                                                                if (intValue2 != 66) {
                                                                                                                                                    i5 = 38;
                                                                                                                                                    if (intValue2 != 67) {
                                                                                                                                                        if (intValue2 != 78) {
                                                                                                                                                            i5 = 54;
                                                                                                                                                            if (intValue2 != 79) {
                                                                                                                                                                i5 = 53;
                                                                                                                                                                if (intValue2 != 81) {
                                                                                                                                                                    i5 = 50;
                                                                                                                                                                    if (intValue2 != 82) {
                                                                                                                                                                        if (intValue2 != 85) {
                                                                                                                                                                            if (intValue2 != 92) {
                                                                                                                                                                                if (intValue2 != 93) {
                                                                                                                                                                                    if (intValue2 != 97) {
                                                                                                                                                                                        if (intValue2 != 99) {
                                                                                                                                                                                            i5 = 64;
                                                                                                                                                                                            if (intValue2 != 105) {
                                                                                                                                                                                                if (intValue2 == 106) {
                                                                                                                                                                                                    i5 = 65;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    StringBuilder A10 = AnonymousClass000.A10();
                                                                                                                                                                                                    A10.append("MESSAGING_FUNNEL_LOGGER Message type to media type error. Got an unsupported\n                | message type (FMessageType) '");
                                                                                                                                                                                                    A10.append(num4);
                                                                                                                                                                                                    Log.i(AnonymousClass1YE.A07(AnonymousClass1Y7.A02(AnonymousClass000.A0y("'.", A10)), "\n", "", false));
                                                                                                                                                                                                    i2 = 1;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i2 = Integer.valueOf(i9);
                                                                                                                    }
                                                                                                                }
                                                                                                                i2 = Integer.valueOf(i8);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i2 = Integer.valueOf(i7);
                                                                            }
                                                                        }
                                                                    }
                                                                    i2 = 14;
                                                                }
                                                            }
                                                        }
                                                        i2 = Integer.valueOf(i6);
                                                    }
                                                }
                                                i2 = 8;
                                            }
                                        }
                                    }
                                    i2 = Integer.valueOf(i5);
                                }
                                i2 = 3;
                            }
                            i2 = Integer.valueOf(i4);
                        }
                        i2 = Integer.valueOf(i3);
                    }
                }
                r62.A01 = i2;
                r62.A02 = Integer.valueOf(intValue);
                r7.A02.CC4(r62);
            }
            Integer num5 = this.$builder.A04;
            if (num5 != null && num5.intValue() == 4 && C18070vi.A18(this.$currentChatSession, this.this$0.A00)) {
                this.this$0.A00 = null;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0n("An action is required to build a messaging funnel event.");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessagingFunnelLoggerImpl$logAction$queueingResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
