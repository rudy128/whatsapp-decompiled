package X;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.Dlq  reason: case insensitive filesystem */
public final class C27814Dlq extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25527ChP $buffer;
    public final /* synthetic */ BXN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27814Dlq(C25527ChP chP, BXN bxn) {
        super(0);
        this.this$0 = bxn;
        this.$buffer = chP;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        byte[] bArr;
        String str;
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A01("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER]: snAppManagerChannel.onReceived");
        ByteBuffer byteBuffer = this.$buffer.A00;
        if (byteBuffer != null) {
            BXN bxn = this.this$0;
            C23624Bmt A0N = C23658BnR.DEFAULT_INSTANCE.A0N();
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
                C18070vi.A0X(bArr);
            } else {
                int position = byteBuffer.position();
                bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(position);
            }
            A0N.A0A(bArr);
            C23658BnR bnR = (C23658BnR) A0N.A0C();
            if (bxn.A02.get()) {
                cn1.A02("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER]: snAppManagerChannel, handle stop requested");
                CompletableFuture A01 = bxn.A01.A00.A01();
                if (A01 != null) {
                    A01.complete(bnR.A0R().name());
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("[SN_APP_MANAGER] response: ");
            cn1.A02("sup:SNAppManagerStateDelegate", AnonymousClass000.A0y(bnR.A0R().name(), A10));
            switch (bnR.A0R().ordinal()) {
                case 0:
                    str = "SNAPP_UNKNOWN_ERROR";
                    break;
                case 1:
                case 12:
                    BXN.A02(bxn);
                    break;
                case 2:
                    str = "SNAPP_UNKNOWN_MESSAGE";
                    break;
                case 3:
                    str = "SNAPP_UNHANDLED_MESSAGE";
                    break;
                case 4:
                    str = "SNAPP_PAYLOAD_CORRUPTED";
                    break;
                case 5:
                    str = "SNAPP_UNSUPPORTED_APP";
                    break;
                case 6:
                    str = "SNAPP_NOT_ENOUGH_BATTERY";
                    break;
                case 7:
                    str = "SNAPP_THERMAL_THROTTLING";
                    break;
                case 8:
                    str = "SNAPP_NOT_ENOUGH_STORAGE";
                    break;
                case 9:
                    str = "SNAPP_START_APP_FAILED";
                    break;
                case 10:
                    str = "SNAPP_STOP_APP_FAILED";
                    break;
                case 11:
                    str = "SNAPP_APP_NOT_RUNNING";
                    break;
                case 13:
                    str = "SNAPP_NOT_ENOUGH_PRIORITY";
                    break;
                case 14:
                    str = "SNAPP_CHARGING_NOT_CONNECTED";
                    break;
                case 15:
                    str = "SNAPP_DENIED_BY_PEAK_POWER";
                    break;
                default:
                    str = "SNAPP_UNRECOGNIZED";
                    break;
            }
            cn1.A04("sup:SNAppManagerStateDelegate", AnonymousClass001.A1H("[SN_APP_MANAGER]: SNAPP ERROR: ", str, AnonymousClass000.A10()), (Throwable) null);
            BQm bQm = bxn.A01;
            C25838Cms cms = bQm.A0J;
            if (cms != null) {
                cms.A04("failure_reason", "media_stream_service_start_request_failure");
                cms.A01(3);
            }
            bQm.A0C(new C22951BWx(str), (Throwable) null, true);
        }
        return C27621Wu.A00;
    }
}
