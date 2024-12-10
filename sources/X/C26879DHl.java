package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.xanalytics.XAnalyticsAdapter;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.DHl  reason: case insensitive filesystem */
public final class C26879DHl implements XAnalyticsAdapter {
    public C24317BzE A00;
    public String A01;
    public final CQP A02;

    public static String A00(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            return optJSONArray.toString();
        }
        return null;
    }

    public void cleanup() {
    }

    public void flush() {
    }

    public void logCounter(String str, double d) {
    }

    public void logCounter(String str, double d, String str2) {
    }

    public boolean shouldLog(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("arfx_render_time") || str.equals("arfx_waterfall")) {
            return true;
        }
        return false;
    }

    public static final void A01(JSONObject jSONObject) {
        Object opt = jSONObject.opt("effect_instance_id");
        if (opt != null && !opt.equals(JSONObject.NULL) && C18070vi.A18(opt.toString(), "0")) {
            jSONObject.put("effect_instance_id", "");
        }
    }

    public void logEventBypassSampling(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = str;
        String str7 = str2;
        C18070vi.A0h(str6, str7);
        if (str6.equals("arfx_render_time")) {
            JSONObject A16 = C17880vN.A16(str7);
            String str8 = this.A01;
            if (str8 != null) {
                A16.put("delivery_operation_id", str8);
            }
            A01(A16);
            CQP cqp = this.A02;
            CQP cqp2 = cqp;
            if (!C72453Mb.A1a(cqp.A02)) {
                C23855BrC brC = new C23855BrC();
                brC.A0n = A6n.A02("camera_product_name", A16);
                brC.A0q = A6n.A02("effect_session_id", A16);
                brC.A0o = A6n.A02("delivery_operation_id", A16);
                brC.A12 = A6n.A02("product_session_id", A16);
                brC.A0p = A6n.A02("effect_instance_id", A16);
                brC.A0j = A6n.A01("initialization_duration_ms", A16);
                brC.A0k = A6n.A01("services_load_time_ms", A16);
                brC.A02 = A6n.A01("effect_load_time_ms", A16);
                brC.A0l = A6n.A01("session_duration_ms", A16);
                brC.A03 = A6n.A01("first_frame_render_time_ms", A16);
                brC.A0h = A6n.A01("frame_count", A16);
                brC.A01 = A6n.A01("average_render_time_ms", A16);
                brC.A0m = A6n.A01("variance_ms", A16);
                brC.A00 = A6n.A01("average_frame_time_ms", A16);
                brC.A0i = A6n.A01("frame_time_variance_ms", A16);
                JSONArray optJSONArray = A16.optJSONArray("input_size");
                String str9 = null;
                if (optJSONArray != null) {
                    str4 = optJSONArray.toString();
                } else {
                    str4 = null;
                }
                brC.A10 = str4;
                JSONArray optJSONArray2 = A16.optJSONArray("virtual_input_size");
                if (optJSONArray2 != null) {
                    str5 = optJSONArray2.toString();
                } else {
                    str5 = null;
                }
                brC.A13 = str5;
                brC.A11 = A00("output_size", A16);
                JSONObject optJSONObject = A16.optJSONObject("foreground_time_detail");
                if (optJSONObject != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("front");
                    if (optJSONObject2 != null) {
                        String str10 = null;
                        String str11 = null;
                        Long l = null;
                        Long l2 = null;
                        Long l3 = null;
                        Long l4 = null;
                        Long l5 = null;
                        Long l6 = null;
                        Long l7 = null;
                        Long l8 = null;
                        Long A012 = A6n.A01("average_frame_time_ms", optJSONObject2);
                        Long A013 = A6n.A01("average_render_time_ms", optJSONObject2);
                        Long A014 = A6n.A01("frame_count", optJSONObject2);
                        Long A015 = A6n.A01("frame_time_variance_ms", optJSONObject2);
                        Long A016 = A6n.A01("variance_ms", optJSONObject2);
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("partition_timings");
                        if (optJSONObject3 != null) {
                            str9 = A00("partition_average_frame_time", optJSONObject3);
                            str10 = A00("partition_largest_frame_time", optJSONObject3);
                            str11 = A00("partition_smallest_frame_time", optJSONObject3);
                        }
                        JSONObject optJSONObject4 = optJSONObject2.optJSONObject("fps");
                        if (optJSONObject4 != null) {
                            l = A6n.A01("average", optJSONObject4);
                            l2 = A6n.A01("frame_count", optJSONObject4);
                            l3 = A6n.A01("outlier_fps", optJSONObject4);
                            l4 = A6n.A01("p0", optJSONObject4);
                            l5 = A6n.A01("p1", optJSONObject4);
                            l6 = A6n.A01("p10", optJSONObject4);
                            l7 = A6n.A01("p50", optJSONObject4);
                            l8 = A6n.A01("p100", optJSONObject4);
                        }
                        brC.A0H = A012;
                        brC.A0I = A013;
                        brC.A0R = A014;
                        brC.A0S = A015;
                        brC.A0T = A016;
                        brC.A0u = str9;
                        brC.A0v = str10;
                        brC.A0w = str11;
                        brC.A0J = l;
                        brC.A0K = l2;
                        brC.A0L = l3;
                        brC.A0M = l4;
                        brC.A0N = l5;
                        brC.A0O = l6;
                        brC.A0Q = l7;
                        brC.A0P = l8;
                    }
                    JSONObject optJSONObject5 = optJSONObject.optJSONObject("back");
                    if (optJSONObject5 != null) {
                        String str12 = null;
                        String str13 = null;
                        String str14 = null;
                        Long l9 = null;
                        Long l10 = null;
                        Long l11 = null;
                        Long l12 = null;
                        Long l13 = null;
                        Long l14 = null;
                        Long l15 = null;
                        Long l16 = null;
                        Long A017 = A6n.A01("average_frame_time_ms", optJSONObject5);
                        Long A018 = A6n.A01("average_render_time_ms", optJSONObject5);
                        Long A019 = A6n.A01("frame_count", optJSONObject5);
                        Long A0110 = A6n.A01("frame_time_variance_ms", optJSONObject5);
                        Long A0111 = A6n.A01("variance_ms", optJSONObject5);
                        JSONObject optJSONObject6 = optJSONObject5.optJSONObject("partition_timings");
                        if (optJSONObject6 != null) {
                            str14 = A00("partition_average_frame_time", optJSONObject6);
                            str12 = A00("partition_largest_frame_time", optJSONObject6);
                            str13 = A00("partition_smallest_frame_time", optJSONObject6);
                        }
                        JSONObject optJSONObject7 = optJSONObject5.optJSONObject("fps");
                        if (optJSONObject7 != null) {
                            l9 = A6n.A01("average", optJSONObject7);
                            l10 = A6n.A01("frame_count", optJSONObject7);
                            l11 = A6n.A01("outlier_fps", optJSONObject7);
                            l12 = A6n.A01("p0", optJSONObject7);
                            l13 = A6n.A01("p1", optJSONObject7);
                            l14 = A6n.A01("p10", optJSONObject7);
                            l15 = A6n.A01("p50", optJSONObject7);
                            l16 = A6n.A01("p100", optJSONObject7);
                        }
                        brC.A04 = A017;
                        brC.A05 = A018;
                        brC.A0E = A019;
                        brC.A0F = A0110;
                        brC.A0G = A0111;
                        brC.A0r = str14;
                        brC.A0s = str12;
                        brC.A0t = str13;
                        brC.A06 = l9;
                        brC.A07 = l10;
                        brC.A08 = l11;
                        brC.A09 = l12;
                        brC.A0A = l13;
                        brC.A0B = l14;
                        brC.A0D = l15;
                        brC.A0C = l16;
                    }
                    JSONObject optJSONObject8 = optJSONObject.optJSONObject("unspecified");
                    if (optJSONObject8 != null) {
                        String str15 = null;
                        String str16 = null;
                        String str17 = null;
                        Long l17 = null;
                        Long l18 = null;
                        Long l19 = null;
                        Long l20 = null;
                        Long l21 = null;
                        Long l22 = null;
                        Long l23 = null;
                        Long l24 = null;
                        Long A0112 = A6n.A01("average_frame_time_ms", optJSONObject8);
                        Long A0113 = A6n.A01("average_render_time_ms", optJSONObject8);
                        Long A0114 = A6n.A01("frame_count", optJSONObject8);
                        Long A0115 = A6n.A01("frame_time_variance_ms", optJSONObject8);
                        Long A0116 = A6n.A01("variance_ms", optJSONObject8);
                        JSONObject optJSONObject9 = optJSONObject8.optJSONObject("partition_timings");
                        if (optJSONObject9 != null) {
                            str17 = A00("partition_average_frame_time", optJSONObject9);
                            str15 = A00("partition_largest_frame_time", optJSONObject9);
                            str16 = A00("partition_smallest_frame_time", optJSONObject9);
                        }
                        JSONObject optJSONObject10 = optJSONObject8.optJSONObject("fps");
                        if (optJSONObject10 != null) {
                            l17 = A6n.A01("average", optJSONObject10);
                            l18 = A6n.A01("frame_count", optJSONObject10);
                            l19 = A6n.A01("outlier_fps", optJSONObject10);
                            l20 = A6n.A01("p0", optJSONObject10);
                            l21 = A6n.A01("p1", optJSONObject10);
                            l22 = A6n.A01("p10", optJSONObject10);
                            l23 = A6n.A01("p50", optJSONObject10);
                            l24 = A6n.A01("p100", optJSONObject10);
                        }
                        brC.A0U = A0112;
                        brC.A0V = A0113;
                        brC.A0e = A0114;
                        brC.A0f = A0115;
                        brC.A0g = A0116;
                        brC.A0x = str17;
                        brC.A0y = str15;
                        brC.A0z = str16;
                        brC.A0W = l17;
                        brC.A0X = l18;
                        brC.A0Y = l19;
                        brC.A0Z = l20;
                        brC.A0a = l21;
                        brC.A0b = l22;
                        brC.A0d = l23;
                        brC.A0c = l24;
                    }
                }
                cqp2.A01.CC7(brC);
            }
        } else if (str6.equals("arfx_waterfall")) {
            JSONObject A162 = C17880vN.A16(str7);
            String str18 = this.A01;
            if (str18 != null) {
                A162.put("delivery_operation_id", str18);
            }
            C24317BzE bzE = this.A00;
            if (bzE != null) {
                int ordinal = bzE.ordinal();
                if (ordinal == 1) {
                    str3 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                } else if (ordinal != 2) {
                    str3 = "unknown";
                } else {
                    str3 = "system";
                }
                A162.put("session_start_intent", str3);
            }
            A01(A162);
            CQP cqp3 = this.A02;
            if (!C72453Mb.A1a(cqp3.A02)) {
                C23835Bqs bqs = new C23835Bqs();
                bqs.A00 = A6n.A02("camera_product_name", A162);
                bqs.A03 = A6n.A02("effect_session_id", A162);
                bqs.A01 = A6n.A02("delivery_operation_id", A162);
                bqs.A04 = A6n.A02("product_session_id", A162);
                bqs.A02 = A6n.A02("effect_instance_id", A162);
                bqs.A06 = A6n.A02("waterfall_event", A162);
                bqs.A05 = A6n.A02("session_start_intent", A162);
                cqp3.A01.CC7(bqs);
            }
        }
    }

    public C26879DHl(CQP cqp) {
        this.A02 = cqp;
    }

    public void logEvent(String str, String str2, String str3, boolean z, double d) {
        C18070vi.A0h(str, str2);
        logEventBypassSampling(str, str2);
    }

    public String getStructureSamplingConfig(String str) {
        return "";
    }
}
