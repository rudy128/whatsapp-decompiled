package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.1Kk  reason: invalid class name and case insensitive filesystem */
public abstract class C24461Kk {
    public static String A00(int i) {
        short s = (short) (i & 65535);
        switch ((short) (i >> 16)) {
            case 249:
                if (s == 1) {
                    return "CAMERA_PERSON_SEGMENTATION_SINGLE_FRAME";
                }
                if (s == 2) {
                    return "CAMERA_FACE_TRACKER_SINGLE_FRAME";
                }
                if (s == 3) {
                    return "CAMERA_WORLD_TRACKER_SINGLE_FRAME";
                }
                if (s == 4) {
                    return "CAMERA_WORLD_TRACKER_ADD_ANCHOR";
                }
                if (s == 6) {
                    return "CAMERA_FACE_TRACKER_NORMALIZE_IMAGE";
                }
                if (s == 7) {
                    return "CAMERA_FACE_TRACKER_TRACK_TARGETS";
                }
                if (s == 13) {
                    return "CAMERA_AR_SERVICE_CREATE";
                }
                if (s == 14) {
                    return "CAMERA_AR_SERVICEHOST_PREPARE";
                }
                if (s == 30) {
                    return "CAMERA_ARENGINE_EFFECT_CREATE";
                }
                if (s == 31) {
                    return "CAMERA_ARENGINE_EFFECT_LOAD";
                }
                if (s == 40) {
                    return "CAMERA_AR_SERVICE_SNAPSHOT_ALL";
                }
                if (s == 41) {
                    return "CAMERA_ARENGINE_WAIT_FACETRACKER_RESULT";
                }
                if (s == 45) {
                    return "CAMERA_ARENGINE_GPU_TIME";
                }
                if (s == 46) {
                    return "CAMERA_CAMERA_SINGLE_EFFECT_RUN";
                }
                switch (s) {
                    case 8:
                        return "CAMERA_FACE_TRACKER_3D_INFERENCE";
                    case 9:
                        return "CAMERA_FACE_TRACKER_ACQUIRE_TARGETS";
                    case 10:
                        return "CAMERA_FACE_TRACKER_LOAD_MODELS";
                    case 11:
                        return "CAMERA_AR_SERVICE_LOAD";
                    case 56:
                        return "CAMERA_AR_RENDER_TIME";
                    case 59:
                        return "CAMERA_ARENGINE_WAIT_FOR_DATA";
                    case 71:
                        return "CAMERA_FACE_TRACKER_TRACK_IRIS";
                    case 72:
                        return "CAMERA_FACE_TRACKER_IRIS_3D_INFERENCE";
                    case 73:
                        return "CAMERA_ARENGINE_TEXTURE_STORAGE_LOAD";
                    case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                        return "CAMERA_HAND_TRACKING_FRAME";
                    case C166418cr.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                        return "CAMERA_FACE_TRACKER_EXPRESSION_TRACKING_CALCULATE_WEIGHTS";
                    case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                        return "CAMERA_FACE_TRACKER_FACIAL_GESTURE_CLASSIFIER";
                    case 79:
                        return "CAMERA_IMAGETRACKERADDPATTERN";
                    case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                        return "CAMERA_IMAGETRACKERDETERMINEPOSES";
                    case 81:
                        return "CAMERA_RECOGNITIONTRACKINGSTEP";
                    case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                        return "CAMERA_RECOGNITIONTRACKINGONRECOGNIZED";
                    case 84:
                        return "CAMERA_STANDALONE_TRACKING_UPDATE_AND_TRACK_FRAME";
                    case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER /*87*/:
                        return "CAMERA_IMAGETRACKERSYNCPROCESSFRAME";
                    case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER /*94*/:
                        return "CAMERA_FACE_ACTIONS_REFINE_BLENDSHAPES";
                    case 95:
                        return "CAMERA_FACE_ACTIONS_LOAD_MODEL";
                    case 96:
                        return "CAMERA_HAIR_SEGMENTATION_SINGLE_FRAME";
                    case 98:
                        return "CAMERA_HAIR_SEGMENTATION_NORMALIZE";
                    case 99:
                        return "CAMERA_HAIR_SEGMENTATION_CAFFE2";
                    case 100:
                        return "CAMERA_HAIR_SEGMENTATION_NORMALIZEOUTPUT";
                    case 101:
                        return "CAMERA_HAIR_SEGMENTATION_LOAD_MODEL";
                    case 102:
                        return "CAMERA_PERSON_SEGMENTATION_LOAD_MODEL";
                    case 103:
                        return "CAMERA_HAND_TRACKING_INIT";
                    case 104:
                        return "CAMERA_HAND_TRACKING_LOAD_MODEL";
                    case 109:
                        return "CAMERA_POPCORN_BENCHMARK_RUN";
                    case 113:
                        return "CAMERA_POPCORN_BENCHMARK_RUN_BEFORE_TEARDOWN";
                    case 115:
                        return "CAMERA_TARGET_TRACKER_SINGLE_FRAME";
                    case 116:
                        return "CAMERA_MULTICLASS_SEGMENTATION_NORMALIZEOUTPUT";
                    case 117:
                        return "CAMERA_BODY_TRACKING_SINGLE_FRAME";
                    case 118:
                        return "CAMERA_BODY_TRACKING_LOAD_MODEL";
                    case 119:
                        return "CAMERA_BODY_TRACKING_NORMALIZE_INPUT";
                    case 120:
                        return "CAMERA_BODY_TRACKING_NORMALIZE_BGRA_INPUT";
                    case 121:
                        return "CAMERA_BODY_TRACKING_CAFFE2";
                    case 1032:
                        return "CAMERA_LANDMARK_AR_SINGLE_FRAME";
                    case 1069:
                        return "CAMERA_FC_AR_RENDERING_HEARTBEAT";
                    case 1089:
                        return "CAMERA_SV_SEGMENTATION_CLOTHING_PER_FRAME_TIME";
                    case 1226:
                        return "CAMERA_WORLD_TRACKER_TRACK_POINT";
                    case 1466:
                        return "CAMERA_SV_GENERIC_PER_FRAME_TIME";
                    case 2018:
                        return "CAMERA_EFFECT_SESSION_START";
                    case 2077:
                        return "CAMERA_OPEN_ML_PBP_PROCESS_IMAGE_BUFFER";
                    case 2296:
                        return "CAMERA_ARENGINE_AVATAR_SKELETON_INIT";
                    case 2505:
                        return "CAMERA_FACE_ACTIONS_PROCESS_IMAGE_BUFFER";
                    case 2735:
                        return "CAMERA_ARENGINE_AVATAR_RENDER_INIT";
                    case 3100:
                        return "CAMERA_AR_SESSION";
                    case 3245:
                        return "CAMERA_PERFORMANCE_TEST_MODELRUN";
                    case 3598:
                        return "CAMERA_WOLF_SLAM_INIT_TIME";
                    case 3772:
                        return "CAMERA_OPEN_ML_CONVERT_INPUT_FORMAT";
                    case 3852:
                        return "CAMERA_JSVM_SCRIPT_EXECUTE";
                    case 3941:
                        return "CAMERA_FACE_ACTIONS_PLUGINS_RESET_CALIBRATION";
                    case 4162:
                        return "CAMERA_FC_AR_RENDERING";
                    case 4344:
                        return "CAMERA_PERFORMANCE_TEST_LOAD_MODEL";
                    case 4406:
                        return "CAMERA_ARENGINE_SCRIPT_DOCUMENT_CREATE";
                    case 4759:
                        return "CAMERA_SV_SEGMENTATION_FACE_PARSING_INFERENCE_TIME";
                    case 5090:
                        return "CAMERA_SV_SEGMENTATION_FACE_PARSING_PER_FRAME_TIME";
                    case 5145:
                        return "CAMERA_SV_BODY_TRACKING_MODEL_LOAD";
                    case 5163:
                        return "CAMERA_SV_BODY_TRACKING_INFERENCE_TIME";
                    case 5372:
                        return "CAMERA_FACE_ACTIONS_INFERENCE";
                    case 5411:
                        return "CAMERA_ARENGINE_RENDERER_SUBMIT_SHAPE";
                    case 5416:
                        return "CAMERA_AR_SYS_RESOURCE";
                    case 5880:
                        return "CAMERA_SV_SEGMENTATION_CLOTHING_INFERENCE_TIME";
                    case 5886:
                        return "CAMERA_GAN_MODEL_INFERENCE";
                    case 6148:
                        return "CAMERA_FACE_ACTIONS_CONVERT_IMAGE_FORMAT";
                    case 7280:
                        return "CAMERA_SV_HAND_TRACKING_INFERENCE_TIME";
                    case 7660:
                        return "CAMERA_WORLD_TRACKER_INPUTSYNC_PROCESSINPUT";
                    case 7667:
                        return "CAMERA_SV_SEGMENTATION_CLOTHING_MODEL_LOAD";
                    case 7765:
                        return "CAMERA_IG_CAMERA_WRITE_DEVICE_CAPABILITIES";
                    case 7824:
                        return "CAMERA_AR_SUBEFFECT_FIRST_SYNC";
                    case 8005:
                        return "CAMERA_WORLD_TRACKER_CALCULATOR_FIRSTFRAME_RENDER";
                    case 8065:
                        return "CAMERA_MULTICLASS_SEGMENTATION_NORMALIZE";
                    case 8184:
                        return "CAMERA_FACEWAVE_SINGLE_FRAME";
                    case 8285:
                        return "CAMERA_SV_SEGMENTATION_FACE_PARSING_MODEL_LOAD";
                    case 8345:
                        return "CAMERA_SV_GENERIC_INFERENCE";
                    case 8413:
                        return "CAMERA_AR_SUBEFFECT_SERVICES_LOAD";
                    case 8432:
                        return "CAMERA_AR_SUBEFFECT_DOWNLOAD";
                    case 8707:
                        return "CAMERA_MLTEXTURE_MODEL_INFERENCE";
                    case 8858:
                        return "CAMERA_SV_HAND_TRACKING_MODEL_LOAD";
                    case 9035:
                        return "CAMERA_FACE_ACTIONS_PLUGIN_WAIT_FOR_DATA";
                    case 9074:
                        return "CAMERA_ARENGINE_AVATAR_RENDER_UPDATE";
                    case 9395:
                        return "CAMERA_WORLD_TRACKER_DETECTPLANE_SINGLE_FRAME";
                    case 9614:
                        return "CAMERA_SV_GAN_CROP_BB_IMAGE";
                    case 9621:
                        return "CAMERA_AR_SUBEFFECT_DESTROY";
                    case 9810:
                        return "CAMERA_MULTICLASS_SEGMENTATION_MODELRUN";
                    case 9854:
                        return "CAMERA_C2E_SINGLE_FRAME";
                    case 9916:
                        return "CAMERA_SV_HAND_TRACKING_PER_FRAME_TIME";
                    case 10373:
                        return "CAMERA_MULTICLASS_SEGMENTATION_LOAD_MODEL";
                    case 10717:
                        return "CAMERA_C2E_LOAD_MODEL";
                    case 10860:
                        return "CAMERA_SV_GENERIC_MODEL_LOAD";
                    case 10980:
                        return "CAMERA_OPEN_ML_ASSIGN_PROCESS_IMAGE_RESULT";
                    case 11100:
                        return "CAMERA_ARENGINE_AVATAR_UPDATE";
                    case 11194:
                        return "CAMERA_SV_DETECTOR_CONTROLLER_PROCESS_INPUT_FRAME";
                    case 11459:
                        return "CAMERA_CAMERA_TIME_TO_RENDER_FILTER";
                    case 11481:
                        return "CAMERA_PERFORMANCE_TEST_SINGLE_FRAME";
                    case 11878:
                        return "CAMERA_SV_TEXTURE_GENERATOR_PER_FRAME_TIME";
                    case 12658:
                        return "CAMERA_MULTICLASS_SEGMENTATION_SINGLE_FRAME";
                    case 12887:
                        return "CAMERA_SV_BODY_TRACKING_PER_FRAME_TIME";
                    case 12981:
                        return "CAMERA_OPEN_ML_TEXTURE_STITCH_MODEL_OUTPUT";
                    case 13002:
                        return "CAMERA_WORLD_TRACKER_ANCHOR_SINGLE_FRAME";
                    case 13317:
                        return "CAMERA_WOLF_FIRSTFRAME_RENDER";
                    case 13896:
                        return "CAMERA_JSVM_INITIALIZE";
                    case 14296:
                        return "CAMERA_OPEN_ML_RUN_ALL_SV_DETECTORS";
                    case 14425:
                        return "CAMERA_FIRST_FRAME_RENDER_TIME";
                    case 14592:
                        return "CAMERA_ARENGINE_AVATAR_LOAD";
                    case 14616:
                        return "CAMERA_AR_SUBEFFECT_METADATA_DOWNLOAD";
                    case 14704:
                        return "CAMERA_AR_SUBEFFECT_CREATE_FROM_EXTERNAL_FBID";
                    case 14809:
                        return "CAMERA_PERFORMANCE_TEST_NORMALIZE";
                    case 14877:
                        return "CAMERA_FACEWAVE_LOAD_MODEL";
                    case 15080:
                        return "CAMERA_AR_SUBEFFECT_LOAD";
                    case 15383:
                        return "CAMERA_UNIFIED_TARGET_TRACKER_SINGLE_FRAME";
                    case 15833:
                        return "CAMERA_OPEN_ML_GENERATE_ALL_MLTEXTURES";
                    case 15872:
                        return "CAMERA_OPEN_ML_LOAD_PYTORCH_MODEL";
                    case 16066:
                        return "CAMERA_WORLD_TRACKER_ALGO_SINGLE_FRAME";
                    case 16193:
                        return "CAMERA_ARENGINE_MATERIAL_CREATE_SHADER_MODULES";
                    case 16238:
                        return "CAMERA_OPEN_ML_TEXTURE_MODEL_PROCESSOR_CREATE_FINAL_OUTPUT_BUFFER";
                    case 16245:
                        return "CAMERA_C2E_PREDICTION";
                    case 16246:
                        return "CAMERA_WORLD_TRACKER_CALCULATOR_STEP";
                    case 21772:
                        return "CAMERA_AR_SERVICE_POST_LOAD";
                    default:
                        switch (s) {
                            case 26:
                                return "CAMERA_ARENGINE_SCRIPT_EXECUTOR_CREATE";
                            case 27:
                                return "CAMERA_ARENGINE_VIEWPORT_PRERENDER";
                            case 28:
                                return "CAMERA_ARENGINE_VIEWPORT_RENDER";
                            default:
                                switch (s) {
                                    case 33:
                                        return "CAMERA_AR_SERVICE_VIDEO_BUFFER_CONVERT";
                                    case 34:
                                        return "CAMERA_ARENGINE_MANIFEST_DESERIALIZE";
                                    case 35:
                                        return "CAMERA_WORLD_TRACKER_SLAM";
                                    case 36:
                                        return "CAMERA_ARENGINE_VIEWPORT_CREATE";
                                    case 37:
                                        return "CAMERA_ARENGINE_RENDER_SESSION_CREATE";
                                    case 38:
                                        return "CAMERA_VISUAL_SLAM_SINGLE_FRAME";
                                    default:
                                        switch (s) {
                                            case 49:
                                                return "CAMERA_PERSON_SEGMENTATION_INIT";
                                            case 50:
                                                return "CAMERA_PERSON_SEGMENTATION_NORMALIZE";
                                            case 51:
                                                return "CAMERA_PERSON_SEGMENTATION_CAFFE2";
                                            case 52:
                                                return "CAMERA_PERSON_SEGMENTATION_NORMALIZEOUTPUT";
                                            default:
                                                switch (s) {
                                                    case 64:
                                                        return "CAMERA_ARENGINE_EFFECT_MIGRATE";
                                                    case 65:
                                                        return "CAMERA_ARENGINE_EFFECT_DOCUMENT_LOAD";
                                                    case 66:
                                                        return "CAMERA_ARENGINE_TEXTURE_LOAD";
                                                    case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                                                        return "CAMERA_ARENGINE_EFFECT_UPDATE_AUDIO";
                                                    case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER /*68*/:
                                                        return "CAMERA_ARENGINE_EFFECT_UPDATE_SCENE";
                                                    case 69:
                                                        return "CAMERA_ARENGINE_EFFECT_UPDATE_SCRIPT";
                                                    default:
                                                        return "UNDEFINED_QPL_EVENT";
                                                }
                                        }
                                }
                        }
                }
            case 342:
                switch (s) {
                    case 1:
                        return "AR_DELIVERY_EFFECT_LOAD_USER_REQUEST";
                    case 2:
                        return "AR_DELIVERY_EFFECT_LOAD_PREFETCH";
                    case 3:
                        return "AR_DELIVERY_ASSET_FETCH_PREFETCH";
                    case 4:
                        return "AR_DELIVERY_ASSET_FETCH_USER_REQUEST";
                    case 5:
                        return "AR_DELIVERY_MODEL_FETCH_USER_REQUEST";
                    case 6:
                        return "AR_DELIVERY_MODEL_FETCH_PREFETCH";
                    default:
                        switch (s) {
                            case 1084:
                                return "AR_DELIVERY_EFFECT_METADATA_DB_FETCH";
                            case 1424:
                                return "AR_DELIVERY_LOCAL_PERSISTENCE_WRITE";
                            case 1965:
                                return "AR_DELIVERY_SPARK_PERSISTENCE_REMOVE";
                            case 2139:
                                return "AR_DELIVERY_FC_EFFECT_FETCH_TRY_IT";
                            case 2172:
                                return "AR_DELIVERY_REMOTE_PERSISTENCE_INITIALIZE";
                            case 3697:
                                return "AR_DELIVERY_EFFECT_LOAD_USERFLOW";
                            case 5101:
                                return "AR_DELIVERY_REMOTE_PERSISTENCE_REMOVE";
                            case 6091:
                                return "AR_DELIVERY_REMOTE_PERSISTENCE_GET";
                            case 7194:
                                return "AR_DELIVERY_REMOTE_PERSISTENCE_SET";
                            case 7869:
                                return "AR_DELIVERY_LOCAL_PERSISTENCE_REMOVE";
                            case 8455:
                                return "AR_DELIVERY_FC_EFFECT_FETCH";
                            case 8772:
                                return "AR_DELIVERY_SPARK_PERSISTENCE_READ";
                            case 8982:
                                return "AR_DELIVERY_MULTIPEER_SEND_MESSAGE";
                            case 9567:
                                return "AR_DELIVERY_DELETE_AUGMENT";
                            case 11034:
                                return "AR_DELIVERY_LOCAL_PERSISTENCE_READ";
                            case 13817:
                                return "AR_DELIVERY_SPARK_PERSISTENCE_WRITE";
                            case 14510:
                                return "AR_DELIVERY_SAVE_AUGMENT";
                            case 15098:
                                return "AR_DELIVERY_QUERY_AUGMENTS";
                            case 15821:
                                return "AR_DELIVERY_ASSET_UPLOAD";
                            case 16165:
                                return "AR_DELIVERY_MULTIPEER_RECEIVE_MESSAGE";
                            default:
                                return "UNDEFINED_QPL_EVENT";
                        }
                }
            case 378:
                if (s == 1861) {
                    return "WA_PERF_IMAGE_OPEN";
                }
                if (s == 2385) {
                    return "WA_PERF_FIRST_FTS_RESULT";
                }
                if (s == 7038) {
                    return "WA_PERF_CONTACT_OPEN";
                }
                if (s == 9129) {
                    return "WA_PERF_CHAT_LIST_SCROLL";
                }
                if (s == 13240) {
                    return "WA_PERF_CHAT_KEYBOARD_OPEN";
                }
                switch (s) {
                    case 1:
                        return "WA_PERF_COLD_START_ANDROID";
                    case 2:
                        return "WA_PERF_WARM_START_ANDROID";
                    case 3:
                        return "WA_PERF_HOT_START_ANDROID";
                    case 4:
                        return "WA_PERF_CAMERA_OPEN";
                    case 5:
                        return "WA_PERF_CHAT_OPEN";
                    case 6:
                        return "WA_PERF_SCROLL_PERF";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 554:
                if (s == 1045) {
                    return "QPL_INTERNAL_WHATSAPP_RID_TEST";
                }
                return "UNDEFINED_QPL_EVENT";
            case 560:
                if (s == 1) {
                    return "BLOKS_PARSE";
                }
                if (s == 2) {
                    return "BLOKS_TTI";
                }
                if (s == 3) {
                    return "BLOKS_LAYOUT";
                }
                if (s == 4) {
                    return "BLOKS_MOUNT";
                }
                if (s == 8656) {
                    return "SCROLL_PERF_COM_BLOKS_WWW_FB_CREATORS_GRAPH_CREATOR_REWARD_AWARENESS_NOTIF";
                }
                if (s == 8657) {
                    return "SCROLL_PERF_GROUP_CONTEXTUAL_PROFILE";
                }
                if (s == 11933) {
                    return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_ACTIVITY_MANAGEMENT_SEARCH_HISTORY";
                }
                if (s == 11934) {
                    return "BLOKS_SCROLL_PERF";
                }
                if (s == 15118) {
                    return "SCROLL_PERF_MEMBER_REQUESTS";
                }
                if (s == 15119) {
                    return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_FB_DND_AUTO_REACTIVATION";
                }
                switch (s) {
                    case 1319:
                        return "SCROLL_PERF_COM_BLOKS_WWW_SERVICE_SHOPS_BUYER_REVIEW";
                    case 1507:
                        return "SCROLL_PERF_COM_BLOKS_WWW_MINISHOP_COLLECTIONS";
                    case 1885:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_AR_AUTH_METHOD";
                    case 2022:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_FB_PROFILE_REELS_LIKED_REELS";
                    case 2096:
                        return "BLOKS_BLOKS_UNEXPECTED_EVENT";
                    case 2257:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_GROUPS_PENDING_PARTICIPANTS_CONTENT_PREVIEW";
                    case 2288:
                        return "SCROLL_PERF_GROUP_PENDING_POSTS";
                    case 2409:
                        return "SCROLL_PERF_COM_BLOKS_WWW_EVENTS_WEEKLY_DIGEST_LANDING";
                    case 2495:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_REAUTH_PASSWORD";
                    case 2551:
                        return "SCROLL_PERF_IX_BLOKS";
                    case 2618:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_FRIENDING_CLOSE_FRIENDS_LIST_PEOPLE_PICKER_CONTROLLER";
                    case 2701:
                        return "SCROLL_PERF_COM_BLOKS_WWW_TWO_STEP_VERIFICATION_ENTER_SMS_CODE";
                    case 2731:
                        return "SCROLL_PERF_PENDING_PARTICIPANTS";
                    case 2813:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_LOGIN_SAVE_CREDENTIALS";
                    case 3010:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FAN_NURTURE_CONTRIBUTION_BOARD_RANKING";
                    case 3152:
                        return "SCROLL_PERF_PROFESSIONAL_HOME";
                    case 3428:
                        return "SCROLL_PERF_COM_BLOKS_WWW_COM_GROUPS_AUTOMATION_ASSIST_CRITERIA_GALLERY";
                    case 3513:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_INSPIRATION_HUB_TEAMPLATES_EXPLORE";
                    case 3745:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FXCAL_SETTINGS";
                    case 3849:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_LOGIN_AYMH_PASSWORD_ENTRY";
                    case 3943:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FB_GROUPS_ADMIN_ONBOARDING_FLOW";
                    case ZipDecompressor.UNZIP_BUFFER_SIZE /*4096*/:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_SECURITY_CHANGE_PASSWORD_REVIEW_LOGINS";
                    case 4301:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PC_GUIDE";
                    case 4543:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FB_PRIVACY_AUDIENCES_SAVED_CUSTOM_EDITING";
                    case 4761:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_GROUP_INVITES";
                    case 4800:
                        return "SCROLL_PERF_COM_BLOKS_WWW_MINISHOPS_STOREFRONT_FB";
                    case 4847:
                        return "BLOKS_BLOKS_COLLECT_USED_NODES";
                    case 4880:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_EVENTS_PERMALINK_SECONDARY_SCREEN_BOTTOM_SHEET";
                    case 4886:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_GROUPS_NAV";
                    case 4925:
                        return "SCROLL_PERF_COM_BLOKS_WWW_META_BIRTHDAY_CENTER";
                    case 5023:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FPM_PLATFORM_TOOLS_MANAGEMENT_HOME";
                    case 5384:
                        return "BLOKS_BLOKS_SCRIPT_ABORT";
                    case 5568:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_CREATOR_HUB_ISSUE_HELP";
                    case 5757:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CHECKPOINT_UFAC_CONTROLLER";
                    case 5832:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_UNIFIED_DYI_FIELD_SELECTION_SCREEN";
                    case 5852:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_DEVICE_MANAGEMENT";
                    case 6022:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_FB_DND_EDUCATION";
                    case 6226:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_CREATOR_EDUCATION_INSPIRATION_HUB";
                    case 6247:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_GROUPS_ADMIN_ADMIN_HOME";
                    case 6309:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FXIM_SETTINGS_NAME";
                    case 6367:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_FB_SOAP_ONBOARDING_SCREEN_MAIN";
                    case 6532:
                        return "SCROLL_PERF_COM_BLOKS_WWW_TWO_STEP_VERIFICATION_APPROVE_FROM_ANOTHER_DEVICE";
                    case 6893:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FXCAL_SETTINGS_POST_ACCOUNT";
                    case 6979:
                        return "BLOKS_ASYNC_ACTION";
                    case 6993:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FB_NAVIGATION_COMMUNITY_PANEL";
                    case 7122:
                        return "SCROLL_PERF_COM_BLOKS_WWW_UNIFIED_TOPIC_CONTROLS_LIST_DATA_DRIVEN_SCREEN";
                    case 7327:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FB_GROUPS_ALL_CHATS";
                    case 7446:
                        return "SCROLL_PERF_SHOPS_SERP_BLOKS";
                    case 7477:
                        return "SCROLL_PERF_COM_BLOKS_WWW_PRODASH_INSIGHTS_PERFORMANCE";
                    case 7509:
                        return "BLOKS_RENDER";
                    case 7659:
                        return "SCROLL_PERF_COM_BLOKS_WWW_PUBLIC_FIGURES_GRAPH_RISING_CREATOR_NOTIF";
                    case 7687:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_LOGIN_AYMH_MULTIPLE_PROFILES_SCREEN_ENTRY";
                    case 7937:
                        return "SCROLL_PERF_COM_BLOKS_WWW_EVENTS_PERMALINK_INVITE_INSTANT_PICKER";
                    case 8022:
                        return "SCROLL_PERF_COM_BLOKS_WWW_AVATAR_EDITOR_CDS_EDITOR_NEW_NAV_SCREEN";
                    case 8170:
                        return "SCROLL_PERF_EVENTS";
                    case 8204:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PROFESSIONAL_DASHBOARD_YOUR_AUDIENCE";
                    case 8647:
                        return "SCROLL_PERF_USER_PAY_STARS";
                    case 8651:
                        return "SCROLL_PERF_GROUPS_CREATION_INVITE_MEMBERS";
                    case 8659:
                        return "BLOKS_SCRIPT_LATENCY";
                    case 8730:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_FB_DELETION_IMPACT";
                    case 8734:
                        return "SCROLL_PERF_CONTROLS_CONTROL_PANEL_RECONNECT";
                    case 8795:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PROFESSIONAL_DASHBOARD_HOME";
                    case 9047:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FB_IMMERSIVE_STORY_CAPTION_BOTTOM_SHEET";
                    case 9161:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PROFESSIONAL_DASHBOARD_COMMENTS_MANAGER";
                    case 9422:
                        return "SCROLL_PERF_COM_BLOKS_WWW_PAYOUT_ONBOARDING";
                    case 9428:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FB_SHORTS_AGGREGATION_HASHTAG";
                    case 9431:
                        return "SCROLL_PERF_COM_BLOKS_WWW_SERVICE_BUYER_REQUEST_DATE_AND_TIME_APP_CONTROLLER";
                    case 10116:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_NUX_QUICK_FRIENDING";
                    case 10176:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_CONTACT_POINT_ADD";
                    case 10189:
                        return "SCROLL_PERF_COM_BLOKS_WWW_AVATAR_EDITOR_CDS_LAUNCHER";
                    case 10348:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FXCAL_SETTINGS_ADS_AD_TOPICS";
                    case 10354:
                        return "SCROLL_PERF_CONTROLS_CONTROL_PANEL_SNOOZE";
                    case 10398:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PC_HOME";
                    case 10431:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_AR_SELECT_ACCOUNT";
                    case 10616:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_GROUPS_ADMIN_ADMIN_QUEUES";
                    case 10824:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_SECURITY_LOGIN_ACTIVITIES_LOGOUT_BOTTOM_SHEET";
                    case 10863:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CDS_BLOKS_SCREEN_IXT_SCREEN_DELTA_UNTRUSTED_CHALLENGE_CHOOSER";
                    case 10930:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FPM_PLATFORM_TOOLS_MOBILE_EXTERNAL";
                    case 11391:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_LOGIN_AYMH_EDIT_VIEW";
                    case 11436:
                        return "SCROLL_PERF_COM_BLOKS_WWW_AVATAR_EDITOR_CDS_TAB_MAIN";
                    case 11577:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_FB_DEACTIVATION_CONFIRM";
                    case 11839:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PC_MODAL";
                    case 11925:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FPM_PLATFORM_TOOLS_CONTENT_LIBRARY";
                    case 12150:
                        return "SCROLL_PERF_COM_BLOKS_WWW_PAYOUT_ONBOARDING_NEW";
                    case 12152:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FXCAL_SETTINGS_NAVIGATION";
                    case 12239:
                        return "SCROLL_PERF_COM_BLOKS_WWW_PRODASH_INSIGHTS_AUDIENCE_FOLLOWERS_METRICS";
                    case 12343:
                        return "SCROLL_PERF_EVENTS_PERMALINK";
                    case 12350:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_CONTACT_POINT_COUNTRY_SELECTOR";
                    case 12364:
                        return "SCROLL_PERF_COM_BLOKS_WWW_USF_SETTINGS_SEARCH_SCREEN";
                    case 12370:
                        return "BLOKS_LISPY_PARSE";
                    case 12571:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CDS_BLOKS_SCREEN_IXT_SCREEN_RENDERER";
                    case 12668:
                        return "SCROLL_PERF_PROFESSIONAL_DASHBOARD";
                    case 12834:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_SECURITY_LOGIN_ACTIVITIES";
                    case 12849:
                        return "BLOKS_ANIMATION_PERF";
                    case 12902:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FAN_NURTURE_TOP_FANS_LIST";
                    case 13003:
                        return "SCROLL_PERF_COM_BLOKS_WWW_USF_GENERIC_SETTINGS_SCREEN";
                    case 13179:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PROFILE_MANAGE_POSTS";
                    case 13209:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_GROUPS_ADMIN_ACTIVITY_LOG";
                    case 13266:
                        return "SCROLL_PERF_GAMING_FULLSCREEN_PLAYER";
                    case 13425:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PROFESSIONAL_DASHBOARD_LEVELING";
                    case 13801:
                        return "SCROLL_PERF_CONTROLS_CONTROL_PANEL_UNFOLLOW";
                    case 13857:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FB_GROUPS_NOTIFICATIONS_SETTINGS";
                    case 13900:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_DND_ENTRY";
                    case 14260:
                        return "SCROLL_PERF_GROUP_NEW_MEMBER_CONSUMPTION_ONBOARDING";
                    case 14311:
                        return "SCROLL_PERF_BLOKS_USF_GENERIC_SETTINGS_SCREEN";
                    case 14430:
                        return "SCROLL_PERF_COM_BLOKS_WWW_EVENTS_CREATION_INITIAL_SCREEN";
                    case 14663:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_VIDEO_PRODUCERS_ENGAGEMENT_BLUE_REELS_ACHIEVEMENTS";
                    case 14678:
                        return "SCROLL_PERF_MINI_SHOP_PRODUCT_DETAILS";
                    case 14794:
                        return "SCROLL_PERF_SHOPS_STOREFRONT_BLOKS";
                    case 14870:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_SECURITY_TWO_FACTOR_SELECT_METHOD";
                    case 15012:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_FB_DND_REASON";
                    case 15251:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_AR_CODE_ENTRY";
                    case 15273:
                        return "SCROLL_PERF_GROUP_NEW_MEMBER_GREETING";
                    case 15432:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_AR_SEARCH";
                    case 15508:
                        return "SCROLL_PERF_BLOKS_PROFILE_LIKE_AS_PAGE_BOTTOM_SHEET";
                    case 15542:
                        return "BLOKS_BIND";
                    case 15758:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FAN_NURTURE_CREATOR_DIGEST_HOME_SCREEN";
                    case 15760:
                        return "SCROLL_PERF_COM_BLOKS_WWW_MINISHOPS_LINK_APP";
                    case 15927:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_PC_POLICY";
                    case 15958:
                        return "SCROLL_PERF_COM_BLOKS_WWW_CAA_AR_INITIATE_VIEW";
                    case 16087:
                        return "SCROLL_PERF_COM_BLOKS_WWW_BLOKS_GROUPS_MODMIN_REVIEW";
                    case 16203:
                        return "SCROLL_PERF_COM_BLOKS_WWW_FX_SETTINGS_SECURITY_CHANGE_PASSWORD";
                    case 28281:
                        return "BLOKS_LISPY";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 1195:
                if (s == 1) {
                    return "WHATSAPP_TTRC_LOGGER_TTRC_LONG_CANCEL";
                }
                if (s == 2) {
                    return "WHATSAPP_TTRC_LOGGER_TTRC_FAILURE";
                }
                if (s == 3449) {
                    return "WHATSAPP_TTRC_LOGGER_UI_ACTION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 1440:
                if (s == 2972) {
                    return "WHATSAPP_TEST_WHATSAPP_TEST_EVENT";
                }
                if (s == 7192) {
                    return "WHATSAPP_TEST_WHATSAPP_USER_EVENT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 1721:
                if (s == 5925) {
                    return "WHATSAPP_DYNAMIC_TEMPLATE_MESSAGE_BLOKS_LOADING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 1921:
                if (s == 3701) {
                    return "WHATSAPP_CONNECTIVITY_CHATD_CONNECT";
                }
                if (s == 8385) {
                    return "WHATSAPP_CONNECTIVITY_CHATD_CONNECTION";
                }
                if (s == 14009) {
                    return "WHATSAPP_CONNECTIVITY_CONNECTION_HEALTH_LOG";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2094:
                if (s == 3464) {
                    return "WHATSAPP_DIRECT_MIGRATION_DIRECT_MIGRATION_BACKGROUND_TASK";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2265:
                if (s == 6272) {
                    return "WA_CONTACTS_CONTACTS_LOADING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2357:
                if (s == 6342) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_MESSAGE_SEND_PERF";
                }
                if (s == 6955) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_IQ_SEND_PERF";
                }
                if (s == 8332) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_GROUP_INFO";
                }
                if (s == 10429) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_MESSAGE_INFO";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2767:
                if (s == 4151) {
                    return "WHATSAPP_BACKUP_WHATSAPP_BACKUP_EVENT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2830:
                switch (s) {
                    case 1846:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_BATCH";
                    case 2215:
                        return "WHATSAPP_PAYMENTS_FLOWS_IN_DEVICE_BINDING_FLOW";
                    case 2489:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_P2M_FLOW";
                    case 3240:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_SME_IQ";
                    case 3374:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_BR_P2P_FLOW";
                    case 3395:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_SEND_P2P";
                    case 3548:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_ORDER_TRANSACTION";
                    case 5136:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_P2P_FLOW";
                    case 5318:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_P2M_CONFIG";
                    case 6042:
                        return "WHATSAPP_PAYMENTS_FLOWS_IN_VALUE_PROP_IMG_RENDER";
                    case 6516:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_SCAN_QR_FLOW";
                    case 7090:
                        return "WHATSAPP_PAYMENTS_FLOWS_BR_ONBOARDING_FLOW";
                    case 7287:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_METHODS_IQ";
                    case 7942:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_VPA_NAME";
                    case 8321:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_LIST_KEYS";
                    case 9013:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_REGISTER";
                    case 9051:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_SEND_TO_VPA";
                    case 9728:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_DEVICE_BINDING";
                    case 10741:
                        return "WHATSAPP_PAYMENTS_FLOWS_ROOTED_DEVICE_CHECK";
                    case 10887:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_VPA";
                    case 11339:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_BANKS";
                    case 11438:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_PAY_PRECHECK";
                    case 11543:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_ACCOUNTS";
                    case 11950:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_PROVIDER_KEY_IQ";
                    case 12311:
                        return "WHATSAPP_PAYMENTS_FLOWS_IN_ONBOARDING_FLOW";
                    case 13244:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_TOKEN_ID_IQ";
                    case 14272:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_PAY_PRECHECK_IQ";
                    case 16372:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_P2M_CHECKOUT_SESSION";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 3063:
                if (s == 2318) {
                    return "WHATSAPP_EXTENSIONS_WAE_INIT_PHOENIX_FLOW";
                }
                if (s == 3629) {
                    return "WHATSAPP_EXTENSIONS_WAE_PSL_PREFETCH";
                }
                if (s == 6582) {
                    return "WHATSAPP_EXTENSIONS_WAE_METADATA";
                }
                if (s == 13913) {
                    return "WHATSAPP_EXTENSIONS_WAE_SCREEN_NAVIGATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3164:
                if (s == 12881) {
                    return "WHATSAPP_BUSINESS_SEARCH_ANDROID_WA_BUSINESS_SEARCH_GPS_LOCATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3286:
                if (s == 2618) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_COLLECTION_PRODUCTS";
                }
                if (s == 5857) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_CATALOG";
                }
                if (s == 8630) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_NATIVE_COMMERCE_CATALOG";
                }
                if (s == 9569) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_COLLECTION_MANAGEMENT_HOME";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3315:
                if (s == 5816) {
                    return "WHATSAPP_BUSINESS_AI_SMB_WA_BIZ_AI_CTWA_TEXT_CONTENT_GEN_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3539:
                switch (s) {
                    case 1035:
                        return "AVATAR_EDITOR_SWITCH_TAB";
                    case 1318:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_NATIVE_E2E";
                    case 1491:
                        return "AVATAR_EDITOR_AUTOGEN_SERVICE";
                    case 1676:
                        return "AVATAR_EDITOR_TTRC";
                    case 2058:
                        return "AVATAR_EDITOR_GENERATE_AVATAR_REQUEST";
                    case 4158:
                        return "AVATAR_EDITOR_LOAD_CHOICE_PREVIEW";
                    case 5086:
                        return "AVATAR_EDITOR_IMMERSIVE_AVATAR_EFFECT_LOAD";
                    case 5102:
                        return "AVATAR_EDITOR_TTRC_CHOICE_PREVIEW_IMG";
                    case 5108:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_LOAD_ACTION_NATIVE";
                    case 5876:
                        return "AVATAR_EDITOR_GENAI_SAVE_TO_CLOSET";
                    case 6571:
                        return "AVATAR_EDITOR_LOAD_CATEGORY";
                    case 6732:
                        return "AVATAR_EDITOR_ACG_APPLY_AVATAR";
                    case 9009:
                        return "AVATAR_EDITOR_RAV_GLB_LOAD_IN_EFFECT";
                    case 9469:
                        return "AVATAR_EDITOR_LOAD_FULL_PREVIEW";
                    case 10063:
                        return "AVATAR_EDITOR_RAV_SET_EFFECT";
                    case 10284:
                        return "AVATAR_EDITOR_ACG_INIT";
                    case 11387:
                        return "AVATAR_EDITOR_RAV_FIRST_FRAME_AFTER_EFFECT_SET";
                    case 12034:
                        return "AVATAR_EDITOR_ACG_PREFETCH";
                    case 12152:
                        return "AVATAR_EDITOR_RAV_FIRST_RENDER_FRAME_FROM_INIT";
                    case 12615:
                        return "AVATAR_EDITOR_VOLTRON_CDL_PREFETCH";
                    case 12906:
                        return "AVATAR_EDITOR_ACG_GENERATE_AVATAR";
                    case 13919:
                        return "AVATAR_EDITOR_ACG_PARAMETRIC_COLOR";
                    case 14249:
                        return "AVATAR_EDITOR_INIT";
                    case 14703:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_PREFETCH_E2E";
                    case 14778:
                        return "AVATAR_EDITOR_SAVE_AVATAR";
                    case 15907:
                        return "AVATAR_EDITOR_RAV_E2E";
                    case 16361:
                        return "AVATAR_EDITOR_LOAD_CART_MODAL";
                    case 16380:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_ASSETS_PREFETCH";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 3645:
                if (s == 4280) {
                    return "WHATSAPP_PAID_MESSAGING_EXPERIENCES_CAROUSEL_MESSAGE_RECEIVE";
                }
                if (s == 11502) {
                    return "WHATSAPP_PAID_MESSAGING_EXPERIENCES_CAROUSEL_MESSAGE_RENDER";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3654:
                if (s == 2486) {
                    return "WA_MEX_EXAMPLE_MEX_OPERATION_EXAMPLE";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3996:
                if (s == 1) {
                    return "WHATSAPP_AI_WA_FS_BOT_INTERACTION";
                }
                if (s == 15835) {
                    return "WHATSAPP_AI_WHATSAPP_IMAGE_DECODER_TIME";
                }
                return "UNDEFINED_QPL_EVENT";
            case 4114:
                if (s == 1) {
                    return "WHATSAPP_INBOX_FILTERS_EVENT_LOAD_AND_RENDER_FILTERS_ROW_ANDROID";
                }
                if (s == 3) {
                    return "WHATSAPP_INBOX_FILTERS_EVENT_LOAD_CHAT_RESULTS_AFTER_FILTER_TAP_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 4307:
                if (s == 4622) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SEND_RECOVERY_CODE";
                }
                if (s == 7150) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SILENT_NOTIFICATION";
                }
                if (s == 7455) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_REQUEST_CODE";
                }
                if (s == 10594) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SEND_CODE";
                }
                return "UNDEFINED_QPL_EVENT";
            case 4799:
                if (s == 3049) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_SMP_SUBSYS_REGISTRY_INIT";
                }
                if (s == 7510) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_FMP_SUBSYS_REGISTRY_INIT";
                }
                if (s == 8685) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_FMP_MSG_REGISTRY_INIT";
                }
                if (s == 13018) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_SMP_MSG_REGISTRY_INIT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 4965:
                if (s == 1227) {
                    return "SGX_VC_GLASSES_WIDGET_INITIALIZATION";
                }
                if (s == 4209) {
                    return "SGX_VC_STREAM_CLIENT_SESSION";
                }
                if (s == 10815) {
                    return "SGX_VC_PHONE_TO_GLASSES_COLD_START";
                }
                if (s == 11826) {
                    return "SGX_VC_GLASSES_LINK_SWITCH";
                }
                if (s == 15757) {
                    return "SGX_VC_PHONE_TO_GLASSES_WARM_START";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5007:
                switch (s) {
                    case 1258:
                        return "AVATARS_ENGINE_PLUGIN_AR_AVATARS_MEMORY_LOAD_DETAIL";
                    case 2404:
                        return "AVATARS_ENGINE_PLUGIN_BODY_ANCHOR_EVENT";
                    case 4069:
                        return "AVATARS_ENGINE_PLUGIN_DESERIALIZE_FRAME";
                    case 4704:
                        return "AVATARS_ENGINE_PLUGIN_TRACKING_INIT";
                    case 6002:
                        return "AVATARS_ENGINE_PLUGIN_MEMORY_LOAD_EVENT";
                    case 6176:
                        return "AVATARS_ENGINE_PLUGIN_AR_AVATARS_LOAD";
                    case 6332:
                        return "AVATARS_ENGINE_PLUGIN_GLB_PREFETCH";
                    case 6513:
                        return "AVATARS_ENGINE_PLUGIN_AVATAR_PRIMITIVE_LOAD";
                    case 8356:
                        return "AVATARS_ENGINE_PLUGIN_STREAMING_INIT";
                    case 10106:
                        return "AVATARS_ENGINE_PLUGIN_RENDER_SESSION";
                    case 11163:
                        return "AVATARS_ENGINE_PLUGIN_FACE_ANCHOR_EVENT";
                    case 11461:
                        return "AVATARS_ENGINE_PLUGIN_POSE_VALIDATION";
                    case 11947:
                        return "AVATARS_ENGINE_PLUGIN_AR_AVATARS";
                    case 12071:
                        return "AVATARS_ENGINE_PLUGIN_SERIALIZE_FRAME";
                    case 14963:
                        return "AVATARS_ENGINE_PLUGIN_AR_AVATARS_UPDATE";
                    case 15674:
                        return "AVATARS_ENGINE_PLUGIN_AR_AVATARS_NETWORK_REQUEST";
                    case 15765:
                        return "AVATARS_ENGINE_PLUGIN_AR_AVATARS_ALE_MODEL";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 5261:
                if (s == 6538) {
                    return "SGX_FALCO_APP_SESSION_END";
                }
                if (s == 7900) {
                    return "SGX_FALCO_APP_SESSION_ERROR";
                }
                if (s == 13340) {
                    return "SGX_FALCO_STREAM_SESSION_IN_PROGRESS";
                }
                if (s == 14046) {
                    return "SGX_FALCO_STREAM_SESSION_END";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5404:
                if (s == 13524) {
                    return "WHATSAPP_AVATAR_WHATSAPP_AVATAR_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5484:
                if (s == 8945) {
                    return "WHATSAPP_SMB_COEX_SMBA_COEX_ONBOARDING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5749:
                if (s == 10644) {
                    return "WHATSAPP_INAPP_SUPPORT_OPEN_CONTEXTUAL_HELP";
                }
                if (s == 11076) {
                    return "WHATSAPP_INAPP_SUPPORT_OPEN_HELP_CENTER";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5892:
                if (s == 1) {
                    return "WHATSAPP_GRAPHQL_WHATSAPP_AUTHENTICATED_GRAPHQL";
                }
                if (s == 8207) {
                    return "WHATSAPP_GRAPHQL_WHATSAPP_SMB_USER_ENTITY_OPERATION";
                }
                if (s == 10937) {
                    return "WHATSAPP_GRAPHQL_WHATSAPP_FB_USER_ENTITY_MANAGEMENT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 6128:
                switch (s) {
                    case 1:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_MM_HYDRATION";
                    case 2:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_BILLING_INFO";
                    case 3:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SEND_MM";
                    case 4:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_REQUEST_CODE";
                    case 5:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_SEND_CODE";
                    case 6:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_SEND_RECOVERY_CODE";
                    case 7:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_SILENT_NOTIFICATION";
                    case 8:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_PREVIEW";
                    case 9:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_INSIGHTS";
                    case 10:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_DELETE_MM";
                    case 11:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_UPDATE_MM_INSIGHT";
                    case 12:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_PRELOAD_COMPOSER_MM";
                    case 13:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_UPDATE_MM";
                    case 14:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_CREATE_MM";
                    case 15:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_SMART_LIST";
                    case 16:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SAVE_SMART_LIST_SELECTION";
                    case 17:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_SENDING_LIMIT";
                    case 18:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_CANCEL_SCHEDULED_MM";
                    case 19:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SEND_SCHEDULED_MM";
                    case 20:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SCHEDULE_MM";
                    case 21:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_LIST";
                    case 22:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_BULK_DELETE_MM";
                    case 23:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 6333:
                if (s == 1) {
                    return "WHATSAPP_SMARTGLASSES_MEDIA_ATTRIBUTION_MEDIA_SHARED";
                }
                return "UNDEFINED_QPL_EVENT";
            case 6787:
                switch (s) {
                    case 1757:
                        return "FX_PRODUCT_FOUNDATION_AC_HOME_LOAD";
                    case 2331:
                        return "FX_PRODUCT_FOUNDATION_SELECT_LINKED_ACCCOUNT_IDENTITY_SCREEN_LOAD";
                    case 3119:
                        return "FX_PRODUCT_FOUNDATION_NTA_FLOW_INITIATED";
                    case 3320:
                        return "FX_PRODUCT_FOUNDATION_MULTI_NATIVE_AUTH_SELECTION_SCREEN_LOAD";
                    case 3417:
                        return "FX_PRODUCT_FOUNDATION_NTA_FLOW_ACCEPT";
                    case 3440:
                        return "FX_PRODUCT_FOUNDATION_MULTI_NATIVE_AUTH_SCREEN_CONTINUE_BUTTON_PRESSED";
                    case 4002:
                        return "FX_PRODUCT_FOUNDATION_DO_LINK_MUTATION";
                    case 4821:
                        return "FX_PRODUCT_FOUNDATION_LINK_DISCLOSURES_SCREEN_LOAD";
                    case 5303:
                        return "FX_PRODUCT_FOUNDATION_ACCOUNT_BLOB_NOT_YOU_BUTTON_PRESSED";
                    case 5766:
                        return "FX_PRODUCT_FOUNDATION_MULTI_NATIVE_AUTH_SCREEN_NOT_YOU_BUTTON_PRESSED";
                    case 6154:
                        return "FX_PRODUCT_FOUNDATION_UNPAUSE_FLOW";
                    case 7152:
                        return "FX_PRODUCT_FOUNDATION_ACCOUNT_TYPE_SELECTION_SCREEN_LOAD";
                    case 7424:
                        return "FX_PRODUCT_FOUNDATION_LINKING_FLOW_INITIATED";
                    case 7600:
                        return "FX_PRODUCT_FOUNDATION_LINK_ACCOUNTS_SCREEN_NOT_YOU_BUTTON_PRESSED";
                    case 8608:
                        return "FX_PRODUCT_FOUNDATION_NATIVE_AUTH_CONSENT_SCREEN_CONTINUE_BUTTON_PRESSED";
                    case 10308:
                        return "FX_PRODUCT_FOUNDATION_WEB_AUTH_PRESCREEN_LOAD";
                    case 10713:
                        return "FX_PRODUCT_FOUNDATION_LINKAGE_CACHE_ACCESS";
                    case 10719:
                        return "FX_PRODUCT_FOUNDATION_NATIVE_AUTH_PRESCREEN_LOAD";
                    case 11833:
                        return "FX_PRODUCT_FOUNDATION_ACCOUNT_BLOB_SCREEN_LOAD";
                    case 12673:
                        return "FX_PRODUCT_FOUNDATION_AGE_RESTRICTION_SCREEN_LOAD";
                    case 13417:
                        return "FX_PRODUCT_FOUNDATION_WEB_AUTH_PRESCREEN_LOGIN_BUTTON_PRESSED";
                    case 13651:
                        return "FX_PRODUCT_FOUNDATION_LINKAGE_CACHE_INIT";
                    case 14860:
                        return "FX_PRODUCT_FOUNDATION_NATIVE_AUTH_CONSENT_SCREEN_NOT_YOU_BUTTON_PRESSED";
                    case 15399:
                        return "FX_PRODUCT_FOUNDATION_LINK_ACCOUNTS_SCREEN_LOAD";
                    case 15730:
                        return "FX_PRODUCT_FOUNDATION_ACCOUNT_TYPE_SELECTED";
                    case 15931:
                        return "FX_PRODUCT_FOUNDATION_WEB_AUTH_SUCCESS";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 6914:
                if (s == 1236) {
                    return "WHATSAPP_STATUS_STATUS_AUDIENCE_SELECTOR_SHARE_SHEET";
                }
                if (s == 2135) {
                    return "WHATSAPP_STATUS_FULL_SCREEN_AUDIENCE_SELECTOR";
                }
                if (s == 2715) {
                    return "WHATSAPP_STATUS_STATUS_CREATION";
                }
                if (s == 3281) {
                    return "WHATSAPP_STATUS_VIEW_STATUS";
                }
                if (s == 4505) {
                    return "WHATSAPP_STATUS_STATUS_AUDIENCE_SELECTOR_DEFAULT_HALF_SHEET";
                }
                if (s == 6188) {
                    return "WHATSAPP_STATUS_ADD_STATUS";
                }
                if (s == 6607) {
                    return "WHATSAPP_STATUS_STATUS_CREATION_FLOW";
                }
                if (s == 11173) {
                    return "WHATSAPP_STATUS_PROFILE_RINGS";
                }
                if (s == 12187) {
                    return "WHATSAPP_STATUS_STATUS_NAVIGATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 7274:
                if (s == 7032) {
                    return "WHATSAPP_INTERNAL_BUG_REPORTING_SUBMIT_BUG";
                }
                if (s == 8010) {
                    return "WHATSAPP_INTERNAL_BUG_REPORTING_UPLOAD_MEDIA";
                }
                return "UNDEFINED_QPL_EVENT";
            case 7543:
                switch (s) {
                    case 1389:
                        return "WHATSAPP_SMARTGLASSES_CALL_HISTORY_SYNC";
                    case 1989:
                        return "WHATSAPP_SMARTGLASSES_SEND_MESSAGE";
                    case 2584:
                        return "WHATSAPP_SMARTGLASSES_ACCEPT_CALL";
                    case 2976:
                        return "WHATSAPP_SMARTGLASSES_MUTE_UNMUTE_MIC";
                    case 3707:
                        return "WHATSAPP_SMARTGLASSES_CALL_STATE_CHANGE";
                    case 4627:
                        return "WHATSAPP_SMARTGLASSES_INCOMING_VOICE_MESSAGE";
                    case 5121:
                        return "WHATSAPP_SMARTGLASSES_CONTACTS_CHANGED";
                    case 6754:
                        return "WHATSAPP_SMARTGLASSES_CONTACT_SYNC_ANDROID_COMPLETENESS";
                    case 7088:
                        return "WHATSAPP_SMARTGLASSES_OUTGOING_VOICE_MESSAGE_VALIDATION";
                    case 7284:
                        return "WHATSAPP_SMARTGLASSES_START_CALL";
                    case 7599:
                        return "WHATSAPP_SMARTGLASSES_INCOMING_MESSAGE";
                    case 8055:
                        return "WHATSAPP_SMARTGLASSES_HANDLE_REQUEST";
                    case 8275:
                        return "WHATSAPP_SMARTGLASSES_MAILBOX_SNAPSHOT_FETCH";
                    case 10074:
                        return "WHATSAPP_SMARTGLASSES_TOGGLE_CALL_BLUETOOTH_AUDIO";
                    case 12334:
                        return "WHATSAPP_SMARTGLASSES_MWA_FOA_IPC";
                    case 12927:
                        return "WHATSAPP_SMARTGLASSES_TOGGLE_VIDEO";
                    case 14348:
                        return "WHATSAPP_SMARTGLASSES_CONTACT_SYNC";
                    case 16189:
                        return "WHATSAPP_SMARTGLASSES_CONTACT_SYNC_RESTRICTED_CURSOR_GET_PROFILE_PICTURE";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 7657:
                if (s == 2635) {
                    return "WHATSAPP_MUSIC_WHATSAPP_MUSIC_METADATA_READ_FROM_DB";
                }
                if (s == 4732) {
                    return "WHATSAPP_MUSIC_WHATSAPP_MUSIC_PRODUCER_ALBUM_ARTWORK_DOWNLOAD";
                }
                if (s == 5917) {
                    return "WHATSAPP_MUSIC_WHATSAPP_MUSIC_PRODUCER_CATALOG_API_CALL";
                }
                if (s == 6738) {
                    return "WHATSAPP_MUSIC_WHATSAPP_MUSIC_METADATA_INSERT_TO_DB";
                }
                if (s == 8091) {
                    return "WHATSAPP_MUSIC_WHATSAPP_OHAI_CALL";
                }
                if (s == 8495) {
                    return "WHATSAPP_MUSIC_WHATSAPP_MUSIC_ACS_TOKEN_FETCH";
                }
                if (s == 12998) {
                    return "WHATSAPP_MUSIC_WHATSAPP_MUSIC_RECEIVER_ALBUM_ARTWORK_DOWNLOAD";
                }
                return "UNDEFINED_QPL_EVENT";
            case 7666:
                if (s == 9870) {
                    return "WA_PRELINK_TTRC_BLOKS_TTRC";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8203:
                if (s == 5029) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_RUN_EVENT";
                }
                if (s == 5984) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_PRIVACY_VIOLATION_EVENT";
                }
                if (s == 8149) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_PRIVACY_UNWRAP";
                }
                if (s == 10634) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_RECLASSIFICATION";
                }
                if (s == 10851) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_TEMPORARY_DECLASSIFICATION";
                }
                if (s == 13429) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_EVALUATOR_ERROR";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8415:
                if (s == 5036) {
                    return "WA_WFL_ACP_DECISION_FLOW";
                }
                if (s == 5962) {
                    return "WA_WFL_AL_LOAD_LATENCY";
                }
                if (s == 7671) {
                    return "WA_WFL_ACP_FLOW";
                }
                if (s == 10096) {
                    return "WA_WFL_WFS";
                }
                if (s == 11865) {
                    return "WA_WFL_WFS_OFFLINE";
                }
                if (s == 13799) {
                    return "WA_WFL_CROSSPOSTING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8424:
                if (s == 4384) {
                    return "WA_NEARBY_DROP_SHARE_VIEW_SETTING_START";
                }
                if (s == 15558) {
                    return "WA_NEARBY_DROP_SHARE_TAP_QR_CODE_END";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8457:
                if (s == 2414) {
                    return "WHATSAPP_CAMERA_CAPTURE_PHOTO";
                }
                if (s == 11195) {
                    return "WHATSAPP_CAMERA_CAPTURE_VIDEO";
                }
                if (s == 12896) {
                    return "WHATSAPP_CAMERA_SWITCH_CAMERA";
                }
                if (s == 13695) {
                    return "WHATSAPP_CAMERA_INIT_CAMERA";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8701:
                if (s == 1) {
                    return "WHATSAPP_VOICENOTE_RECORD_WHATSAPP_VOICENOTE_RECORD";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8827:
                if (s == 4543) {
                    return "WHATSAPP_PHOENIX_BLOKS_PREFETCH";
                }
                if (s == 7055) {
                    return "WHATSAPP_PHOENIX_STATE_EXECUTION";
                }
                if (s == 9396) {
                    return "WHATSAPP_PHOENIX_INIT_STATE_MACHINE";
                }
                if (s == 10774) {
                    return "WHATSAPP_PHOENIX_WHATSAPP_BLOKS";
                }
                if (s == 12868) {
                    return "WHATSAPP_PHOENIX_PHOENIX_FDS_IQ_EXECUTION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8843:
                if (s == 5138) {
                    return "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_CAG_OPEN_TIME";
                }
                if (s == 10073) {
                    return "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_HOME_OPEN_TIME";
                }
                if (s == 10820) {
                    return "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_MEMBER_LOADING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8916:
                if (s == 7110) {
                    return "WHATSAPP_COMPANION_REGISTRATION";
                }
                if (s == 7164) {
                    return "WHATSAPP_COMPANION_LINKING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 9106:
                if (s == 2557) {
                    return "WHATSAPP_BUSINESS_CORE_WHATSAPP_VERIFIED_NAME";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10281:
                if (s == 6584) {
                    return "WHATSAPP_COMMERCE_CATALOG_PDP_TTI";
                }
                if (s == 12568) {
                    return "WHATSAPP_COMMERCE_CATALOG_HOME_TTI";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10287:
                if (s == 3581) {
                    return "AVATAR_SDK_LOAD_LOAD_USER";
                }
                if (s == 4929) {
                    return "AVATAR_SDK_LOAD_LOAD_MEMORY";
                }
                if (s == 14448) {
                    return "AVATAR_SDK_LOAD_LOAD_URI";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10523:
                if (s == 4466) {
                    return "WHATSAPP_SCROLL_PERF_WHATSAPP_SCROLL_PERF";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10603:
                if (s == 6426) {
                    return "WHATSAPP_EXPRESSIONS_TRAY_WHATSAPP_EXPRESSIONS_TRAY_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10699:
                switch (s) {
                    case 2064:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_MANAGER";
                    case 5113:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_SETTING_CLICK";
                    case 7965:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_MESSAGE_INFO_VIEW";
                    case 8857:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_VIEW_WEB_PAGE";
                    case 10140:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_UPSELL_VIEW";
                    case 10766:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_UPSELL_HANDLE_PAYMENT_RESPONSE";
                    case 11568:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_CHANGE";
                    case 12946:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_LINK_DEVICE";
                    case 13047:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_CHECK_AVAILABILITY";
                    case 13712:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_FETCH_ASSIGN_CHAT_AGENT_LIST";
                    case 13888:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_REGISTER";
                    case 13911:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_UPSELL_LAUNCH_PAYMENT";
                    case 14171:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_FETCH_BIZ_INFO";
                    case 14184:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_DELETE";
                    case 15612:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_NAME_DEVICE";
                    case 15633:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_ASSIGN_CHAT";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 10741:
                if (s == 1540) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_MEDIA_VIEW";
                }
                if (s == 4574) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_CHAT_OPEN_V3";
                }
                if (s == 4607) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_CREATE_APPLICATION";
                }
                if (s == 5878) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_STARTUP";
                }
                if (s == 8127) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_GROUP_INFO";
                }
                if (s == 8865) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_MESSAGE_INFO";
                }
                if (s == 11186) {
                    return "WHATSAPP_TTRC_STAR_MESSAGE";
                }
                if (s == 11850) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_CHAT_OPEN";
                }
                if (s == 13259) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_INVITE_A_FRIEND";
                }
                return "UNDEFINED_QPL_EVENT";
            case 11012:
                if (s == 2959) {
                    return "WA_ML_DOWNLOADER_ML_DOWNLOADER_CLEAN_UP";
                }
                if (s == 7576) {
                    return "WA_ML_DOWNLOADER_ML_DOWNLOADER_CANCELED";
                }
                if (s == 10548) {
                    return "WA_ML_DOWNLOADER_ML_DOWNLOADER_ENQUEUE_REQUEST";
                }
                if (s == 10639) {
                    return "WA_ML_DOWNLOADER_ML_DOWNLOADER_CRON_JOB";
                }
                if (s == 13797) {
                    return "WA_ML_DOWNLOADER_ML_DOWNLOADER_MODEL_DOWNLOADING";
                }
                if (s == 14884) {
                    return "WA_ML_DOWNLOADER_ML_DOWNLOADER_STALE_MODEL_DELETION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 11081:
                if (s == 6249) {
                    return "WHATSAPP_VOIP_WHATSAPP_INCOMING_CALL_SETUP";
                }
                if (s == 6357) {
                    return "WHATSAPP_VOIP_WHATSAPP_OUTGOING_CALL_SETUP";
                }
                if (s == 9697) {
                    return "WHATSAPP_VOIP_WHATSAPP_AI_RTC_CONNECTION_SETUP";
                }
                return "UNDEFINED_QPL_EVENT";
            case 11314:
                if (s == 4078) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_POPULAR_BUSINESSES";
                }
                if (s == 6329) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_BUSINESSES_BY_CATEGORY";
                }
                if (s == 7514) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_SEARCH_QUERY";
                }
                if (s == 13878) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_HOME";
                }
                return "UNDEFINED_QPL_EVENT";
            case 11822:
                switch (s) {
                    case 2378:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTIONS_MANAGEMENT_VIEW";
                    case 2681:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_APPEAL";
                    case 2803:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_CREATE";
                    case 3049:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_LOAD_MORE";
                    case 3251:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_ORDER_VIEW";
                    case 3656:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PROFILE_VIEW";
                    case 4816:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_VIEW";
                    case 7530:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_DELETE";
                    case 8027:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CART_VIEW";
                    case 8202:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CART_ADD";
                    case 8525:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PROFILE_SAVE";
                    case 9015:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_VIEW";
                    case 10303:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_APPEAL";
                    case 10505:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PLM_DETAILS_VIEW";
                    case 10891:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_EDIT";
                    case 10926:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_ORDER_CREATE";
                    case 10964:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PROFILE_CATS_VIEW";
                    case 12036:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_SET_VISIBLE";
                    case 12082:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_IMAGES_LOAD";
                    case 12521:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_SAVE";
                    case 13208:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_MESSAGE_SEND";
                    case 13497:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_VIEW_ALL";
                    case 15074:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_COLLECTIONS_VIEW";
                    case 15461:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_REPORT";
                    case 16342:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_RENAME";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 12198:
                if (s == 12407) {
                    return "WHATSAPP_CLASSLOADER_CLASS_LOAD_STATS";
                }
                if (s == 14289) {
                    return "WHATSAPP_CLASSLOADER_DETAILS";
                }
                return "UNDEFINED_QPL_EVENT";
            case 12405:
                if (s == 1) {
                    return "WHATSAPP_BLOKS_ANDROID_WHATSAPP_BLOKS_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 12545:
                if (s == 1) {
                    return "WHATSAPP_MEDIA_TRANSFER_MEDIA_UPLOAD";
                }
                if (s == 2) {
                    return "WHATSAPP_MEDIA_TRANSFER_MEDIA_DOWNLOAD";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13089:
                switch (s) {
                    case 1066:
                        return "FAMILY_EXPERIENCES_AC_HOME_SCREEN_QUERY_TTRC";
                    case 1206:
                        return "FAMILY_EXPERIENCES_PRE_MIGRATION_SCREEN";
                    case 1259:
                        return "FAMILY_EXPERIENCES_CP_CREATE_AVATAR_SCREEN_LOAD";
                    case 1372:
                        return "FAMILY_EXPERIENCES_FX_PF_SYNC_SCREEN_EXPERIMENT_LOAD";
                    case 1430:
                        return "FAMILY_EXPERIENCES_FETA_UPGRADE_MUTATION";
                    case 1557:
                        return "FAMILY_EXPERIENCES_PP_STAGING_SCREEN_LOAD";
                    case 1636:
                        return "FAMILY_EXPERIENCES_CP_SETTINGS_UPSELL_SCREEN_LOAD";
                    case 1900:
                        return "FAMILY_EXPERIENCES_DO_LINK_MUTATION";
                    case 2465:
                        return "FAMILY_EXPERIENCES_SPLIT_REVIEW_CONTACT_POINTS_SCREEN_LOAD";
                    case 2813:
                        return "FAMILY_EXPERIENCES_PROFILE_PHOTO_MUTATION";
                    case 3042:
                        return "FAMILY_EXPERIENCES_FX_GROWTH_CDS_UPSELL_SCREEN_LOAD";
                    case 3046:
                        return "FAMILY_EXPERIENCES_AC_SERVICE_SCREEN_LOAD";
                    case 3427:
                        return "FAMILY_EXPERIENCES_CP_MANAGE_ACCOUNT_SCREEN_LOAD";
                    case 3564:
                        return "FAMILY_EXPERIENCES_CP_LANDING_SCREEN_LOAD";
                    case 3812:
                        return "FAMILY_EXPERIENCES_DO_UNLINK_MUTATION";
                    case 3850:
                        return "FAMILY_EXPERIENCES_AUTO_MIGRATION_SCREEN_SHOWN";
                    case 3912:
                        return "FAMILY_EXPERIENCES_USERNAME_MUTATION";
                    case ZipDecompressor.UNZIP_BUFFER_SIZE /*4096*/:
                        return "FAMILY_EXPERIENCES_AVATAR_UNSYNC_MUTATION";
                    case 4105:
                        return "FAMILY_EXPERIENCES_MERGE_SETUP_META_ACCOUNT_OVERVIEW_SCREEN_LOAD";
                    case 4335:
                        return "FAMILY_EXPERIENCES_DISCLOSURES_SCREEN_LOAD";
                    case 4617:
                        return "FAMILY_EXPERIENCES_IDENTITY_SYNC_MUTATION";
                    case 5025:
                        return "FAMILY_EXPERIENCES_TOS_SCREEN_SHOWN";
                    case 5042:
                        return "FAMILY_EXPERIENCES_PROFILE_PHOTO_SYNC_MUTATION";
                    case 5053:
                        return "FAMILY_EXPERIENCES_DO_AVATAR_UNSYNC_MUTATION";
                    case 5297:
                        return "FAMILY_EXPERIENCES_MEMORIALIZATION_DELETE_AFTER_DEATH_MUTATION";
                    case 5811:
                        return "FAMILY_EXPERIENCES_PP_IMAGE_PICKER_SCREEN_LOAD";
                    case 5883:
                        return "FAMILY_EXPERIENCES_FX_GROWTH_IS_UPSELL_FETCH_SERVER_ELIGIBILITY";
                    case 6148:
                        return "FAMILY_EXPERIENCES_PROFILE_PHOTO_UNSYNC_MUTATION";
                    case 6176:
                        return "FAMILY_EXPERIENCES_AC_HOME_TTRC";
                    case 6201:
                        return "FAMILY_EXPERIENCES_PP_SYNC_MUTATION";
                    case 6449:
                        return "FAMILY_EXPERIENCES_MIGRATION_NOTICE_SCREEN_SHOWN";
                    case 6519:
                        return "FAMILY_EXPERIENCES_SPLIT_ALTERNATIVES_SCREEN_LOAD";
                    case 6672:
                        return "FAMILY_EXPERIENCES_LINK_ACCOUNTS_SCREEN_LOAD";
                    case 6700:
                        return "FAMILY_EXPERIENCES_META_ACCOUNT_NAME_MUTATION";
                    case 6740:
                        return "FAMILY_EXPERIENCES_FX_GROWTH_ADS_UPSELL_SCREEN_LOAD";
                    case 6838:
                        return "FAMILY_EXPERIENCES_FX_IG_FETA_LOGIN_ALERT_MIGRATION_NOTIFICATION_SCREEN_LOAD";
                    case 6934:
                        return "FAMILY_EXPERIENCES_IGNUX_IS_SCREEN_LOAD";
                    case 6982:
                        return "FAMILY_EXPERIENCES_MERGE_DISCLOSURES_SCREEN_LOAD";
                    case 7193:
                        return "FAMILY_EXPERIENCES_MERGE_TWOFAC_RECONCILIATION_SCREEN_LOAD";
                    case 7349:
                        return "FAMILY_EXPERIENCES_MERGE_SETUP_SCREEN_LOAD";
                    case 7471:
                        return "FAMILY_EXPERIENCES_IDENTITY_UNSYNC_MUTATION";
                    case 8077:
                        return "FAMILY_EXPERIENCES_FX_CENTRALIZED_SETTINGS_PHASE_1_PAGE_LOAD";
                    case 8148:
                        return "FAMILY_EXPERIENCES_AC_HOME_FROM_APP_SETTINGS_SCREEN_LOAD";
                    case 8177:
                        return "FAMILY_EXPERIENCES_FETA_MIGRATION_MOMENT_NUX_SCREEN";
                    case 8432:
                        return "FAMILY_EXPERIENCES_DECAL_DISCLOSURES_SCREEN_LOAD";
                    case 8622:
                        return "FAMILY_EXPERIENCES_IGNUX_IS_SYNC_RESOURCES_MUTATION";
                    case 8633:
                        return "FAMILY_EXPERIENCES_DO_AVATAR_SYNC_MUTATION";
                    case 8753:
                        return "FAMILY_EXPERIENCES_FX_CENTRALIZED_SETTINGS_PHASE_1_MUTATION";
                    case 9166:
                        return "FAMILY_EXPERIENCES_MEMORIALIZATION_LEGACY_CONTACT_MUTATION";
                    case 9241:
                        return "FAMILY_EXPERIENCES_FETA_MIGRATION_MOMENT_ACCOUNT_INFO_SCREEN";
                    case 9887:
                        return "FAMILY_EXPERIENCES_PP_UPLOAD_MUTATION";
                    case 10213:
                        return "FAMILY_EXPERIENCES_CP_AVATAR_SYNC_SCREEN_LOAD";
                    case 10308:
                        return "FAMILY_EXPERIENCES_IDENTITY_SWITCHER_LOAD_V2";
                    case 10368:
                        return "FAMILY_EXPERIENCES_DO_SYNC_WO_PHOTOSYNC_MUTATION";
                    case 10431:
                        return "FAMILY_EXPERIENCES_SPLIT_IMPLICATIONS_SCREEN_LOAD";
                    case 10463:
                        return "FAMILY_EXPERIENCES_USERNAME_UNSYNC_MUTATION";
                    case 10594:
                        return "FAMILY_EXPERIENCES_SPLIT_META_ACCOUNT_CREATION_SCREEN_LOAD";
                    case 10743:
                        return "FAMILY_EXPERIENCES_SPLIT_DISCLOSURES_SCREEN_LOAD";
                    case 10812:
                        return "FAMILY_EXPERIENCES_BIRTHDAY_MUTATION";
                    case 10898:
                        return "FAMILY_EXPERIENCES_AC_SETTINGS_NODE_LOAD";
                    case 11020:
                        return "FAMILY_EXPERIENCES_IDENTITY_SWITCHING_TTRC";
                    case 11091:
                        return "FAMILY_EXPERIENCES_MERGE_AGE_RECONCILIATION_SCREEN_LOAD";
                    case 11162:
                        return "FAMILY_EXPERIENCES_FETA_AUTO_MIGRATION_SERVER_FILTER";
                    case 11290:
                        return "FAMILY_EXPERIENCES_DO_SYNC_WITH_PHOTOSYNC_MUTATION";
                    case 11349:
                        return "FAMILY_EXPERIENCES_AC_HOME_SCREEN_LOAD";
                    case 11983:
                        return "FAMILY_EXPERIENCES_DECAL_SCREEN_LOAD";
                    case 12333:
                        return "FAMILY_EXPERIENCES_DO_UNSYNC_MUTATION";
                    case 12515:
                        return "FAMILY_EXPERIENCES_PRE_MIGRATION_SCREEN_SHOWN";
                    case 13082:
                        return "FAMILY_EXPERIENCES_AC_SERVICE_MUTATION";
                    case 13246:
                        return "FAMILY_EXPERIENCES_NATIVE_SWITCHER_IMPRESSION";
                    case 13485:
                        return "FAMILY_EXPERIENCES_ACCESS_LIBRARY_FETCH";
                    case 13486:
                        return "FAMILY_EXPERIENCES_AC_SETTINGS_NODE_IDENTITY_LOAD";
                    case 13523:
                        return "FAMILY_EXPERIENCES_IDENTITY_SWITCHER_LOAD";
                    case 13885:
                        return "FAMILY_EXPERIENCES_ACCESS_LIBRARY_UPDATE";
                    case 13946:
                        return "FAMILY_EXPERIENCES_FETA_TOS_SERVER_FILTER";
                    case 14031:
                        return "FAMILY_EXPERIENCES_FETA_PRE_MIGRATION_SERVER_FILTER";
                    case 14086:
                        return "FAMILY_EXPERIENCES_NAME_MUTATION";
                    case 14147:
                        return "FAMILY_EXPERIENCES_ACCESS_LIBRARY_DELETE";
                    case 14235:
                        return "FAMILY_EXPERIENCES_AVATAR_SYNC_MUTATION";
                    case 14770:
                        return "FAMILY_EXPERIENCES_FETA_AUTO_MIGRATION_VALIDATOR";
                    case 15344:
                        return "FAMILY_EXPERIENCES_AC_SETTINGS_NODE_MUTATION";
                    case 15755:
                        return "FAMILY_EXPERIENCES_CP_PHOTOSYNC_SCREEN_LOAD";
                    case 15855:
                        return "FAMILY_EXPERIENCES_TS_DECAL_SCREEN";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 13303:
                if (s == 1203) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_SERP_REQUEST";
                }
                if (s == 2008) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_DEFAULT_LOCATION";
                }
                if (s == 4996) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_TYPEAHEAD_SEARCH";
                }
                if (s == 7062) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_MAP_VIEW";
                }
                if (s == 8594) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_CACHED_DATA_REQUEST";
                }
                if (s == 14315) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_GPS_LOCATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13450:
                if (s == 1003) {
                    return "WHATSAPP_WDS_INSTANCE_TTL";
                }
                if (s == 15075) {
                    return "WHATSAPP_WDS_INSTANCE_TTL_TEST";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13556:
                if (s == 11178) {
                    return "WHATSAPP_FUNNEL_LOGGING_PTT_MESSAGE";
                }
                if (s == 15684) {
                    return "WHATSAPP_FUNNEL_LOGGING_TEXT_MESSAGE";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13610:
                if (s == 15532) {
                    return "WA_PRELINK_FUNNEL_AC_FLOW";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13694:
                switch (s) {
                    case 1386:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_SINGLE_COLLECTION_CATEGORIES";
                    case 1500:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CATEGORIES";
                    case 1953:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_SINGLE_COLLECTION";
                    case 2090:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_COLLECTIONS";
                    case 2254:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_PRODUCT_LIST";
                    case 3128:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CART";
                    case 4395:
                        return "WHATSAPP_CATALOG_OPERATIONS_VERIFY_POSTCODE";
                    case 4401:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_SINGLE_COLLECTION";
                    case 5314:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_SINGLE_COLLECTION_CATEGORIES";
                    case 6263:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_PRODUCT";
                    case 8216:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_PUBLIC_KEY";
                    case 9314:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_PROMOTIONS";
                    case 9318:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_VARIANTS";
                    case 10103:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CATALOG_SEARCH";
                    case 10123:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_FULLSIZE_PRODUCT";
                    case 10195:
                        return "WHATSAPP_CATALOG_OPERATIONS_PLACE_ORDER";
                    case 10715:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_PRODUCT_LIST";
                    case 10814:
                        return "WHATSAPP_CATALOG_OPERATIONS_REFRESH_CART";
                    case 12994:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CATALOG";
                    case 13375:
                        return "WHATSAPP_CATALOG_OPERATIONS_OPEN_VARIANTS_PAGE";
                    case 14143:
                        return "WHATSAPP_CATALOG_OPERATIONS_PRODUCT_CATALOG_EVENT";
                    case 14286:
                        return "WHATSAPP_CATALOG_OPERATIONS_CATALOG_HOME_PAGE";
                    case 14565:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_CATALOG";
                    case 14773:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_COLLECTIONS";
                    case 15390:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_SENT_CART";
                    case 16159:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_CATEGORIES";
                    case 16317:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_CATALOG_SEARCH";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 13989:
                if (s == 1) {
                    return "WHATSAPP_QPL_LISTENERS_WHATSAPP_QPL_LISTENERS";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14109:
                if (s == 16198) {
                    return "WA_WFL_AL_AC_FLOW";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14143:
                if (s == 1) {
                    return "WHATSAPP_SEARCH_WHATSAPP_GLOBAL_SEARCH";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14154:
                if (s == 2955) {
                    return "WHATSAPP_WAFFLE_CROSSPOST";
                }
                if (s == 5217) {
                    return "WHATSAPP_WAFFLE_STATUS_PRIVACY_SETTINGS_DETAIL";
                }
                if (s == 7566) {
                    return "WHATSAPP_WAFFLE_LINKING";
                }
                if (s == 9353) {
                    return "WHATSAPP_WAFFLE_AUDIENCE_SELECTOR";
                }
                if (s == 12020) {
                    return "WHATSAPP_WAFFLE_CONTEXTUAL_UPSELL";
                }
                if (s == 14007) {
                    return "WHATSAPP_WAFFLE_CONTEXTUAL_CTA";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14447:
                if (s == 1) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_MV_ELIGIBILITY_CHECK";
                }
                if (s == 1403) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_MV_DOC_UPLOAD";
                }
                if (s == 3853) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_NATIVE_TO_BLOKS_ANDROID";
                }
                if (s == 4352) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_MV_IAP_PURCHASE";
                }
                if (s == 4429) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_MV_IDV_UPLOAD";
                }
                if (s == 7627) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_MV_IAP_QUERY_PURCHASE";
                }
                if (s == 13243) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_BLOKS_ANDROID";
                }
                if (s == 13685) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_MV_IAP_FETCH_PRICE";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14951:
                if (s == 4102) {
                    return "AVATAR_CONTENT_DELIVERY_PREFETCH_ASSETS";
                }
                if (s == 4503) {
                    return "AVATAR_CONTENT_DELIVERY_CDL_UPDATE_BODY_PARAMETRICS";
                }
                if (s == 8565) {
                    return "AVATAR_CONTENT_DELIVERY_CDL_GENERATE_AVATAR";
                }
                if (s == 9522) {
                    return "AVATAR_CONTENT_DELIVERY_CDL_GENERATE_RAMP";
                }
                if (s == 10344) {
                    return "AVATAR_CONTENT_DELIVERY_RT_RIG_RETARGETING_GRAPHQL";
                }
                if (s == 11676) {
                    return "AVATAR_CONTENT_DELIVERY_AVATAR_COMBINE";
                }
                if (s == 13498) {
                    return "AVATAR_CONTENT_DELIVERY_ASSET_SAVE";
                }
                if (s == 14327) {
                    return "AVATAR_CONTENT_DELIVERY_ASSET_GLTF_PROCESS";
                }
                return "UNDEFINED_QPL_EVENT";
            case 15113:
                if (s == 7145) {
                    return "WHATSAPP_MEDIA_EXPRESSION_TRAY_USER_JOURNEY";
                }
                if (s == 12603) {
                    return "WHATSAPP_MEDIA_IMAGE_VIDEO_USER_JOURNEY";
                }
                return "UNDEFINED_QPL_EVENT";
            case 15325:
                if (s == 3378) {
                    return "WHATSAPP_X_FAMILY_EVENT_LINKING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 15670:
                if (s == 5671) {
                    return "WHATSAPP_CHANNELS_MEDIA_DISPLAY_LOAD";
                }
                if (s == 8731) {
                    return "WHATSAPP_CHANNELS_CHANNEL_UNFOLLOW";
                }
                if (s == 9521) {
                    return "WHATSAPP_CHANNELS_CHANNEL_CREATE_OR_UPDATE";
                }
                if (s == 10930) {
                    return "WHATSAPP_CHANNELS_CHANNEL_SEARCH";
                }
                if (s == 11639) {
                    return "WHATSAPP_CHANNELS_CHANNEL_FOLLOW";
                }
                if (s == 11688) {
                    return "WHATSAPP_CHANNELS_CHANNEL_DIRECTORY_LOAD";
                }
                if (s == 12752) {
                    return "WHATSAPP_CHANNELS_CHANNEL_UPDATES_TAB_LOAD";
                }
                if (s == 14846) {
                    return "WHATSAPP_CHANNELS_CHANNEL_OPEN";
                }
                return "UNDEFINED_QPL_EVENT";
            case 15707:
                switch (s) {
                    case 1188:
                        return "WHATSAPP_ADS_MANAGE_AD_SCREEN_LOAD";
                    case 2306:
                        return "WHATSAPP_ADS_LOGIN_ACCOUNT_LOAD";
                    case 3121:
                        return "WHATSAPP_ADS_BIZTAB_INSIGHTS_LOAD";
                    case 3242:
                        return "WHATSAPP_ADS_CURRENT_LOCATION_LOAD";
                    case 3645:
                        return "WHATSAPP_ADS_PAYMENT_INFO_SCREEN_TIME_SPENT";
                    case 3913:
                        return "WHATSAPP_ADS_FB_PAGES_LOAD";
                    case 4166:
                        return "WHATSAPP_ADS_AD_SETTINGS_STEP_LOAD";
                    case 4247:
                        return "WHATSAPP_ADS_VIDEO_PROMOTION_LOAD";
                    case 4371:
                        return "WHATSAPP_ADS_ICEBREAKER_LOADING";
                    case 4741:
                        return "WHATSAPP_ADS_BLOKS_BILLING_CCT_BOTTOM_SHEET_LOAD";
                    case 4756:
                        return "WHATSAPP_ADS_AD_CONTEXT_AD_PREVIEW_BOTTOMSHEET_LOAD";
                    case 5897:
                        return "WHATSAPP_ADS_FETCH_QUICK_PROMOTIONS";
                    case 6518:
                        return "WHATSAPP_ADS_AD_ACCOUNT_RECOVERY_REQUEST_CODE";
                    case 6600:
                        return "WHATSAPP_ADS_MAP_LOCATION_TYPEAHEAD_SEARCH_LOAD";
                    case 7345:
                        return "WHATSAPP_ADS_CONSENT_ACTION";
                    case 8306:
                        return "WHATSAPP_ADS_AD_LOAD";
                    case 8330:
                        return "WHATSAPP_ADS_EMBEDDED_PAYMENT_PREFETCHING_SCREEN_LOAD";
                    case 9335:
                        return "WHATSAPP_ADS_MANAGE_ADS_FETCH_NONCE";
                    case 9405:
                        return "WHATSAPP_ADS_BLOKS_BILLING_SCREEN_LOAD";
                    case 10129:
                        return "WHATSAPP_ADS_AD_CREATION_SCREEN_LOAD";
                    case 10409:
                        return "WHATSAPP_ADS_AD_MEDIA_DEFAULT_CONTENT_LOAD";
                    case 10512:
                        return "WHATSAPP_ADS_FB_PAGE_LINK";
                    case 11210:
                        return "WHATSAPP_ADS_EXPLAINER_SCREEN_CONTENT_LOAD";
                    case 11316:
                        return "WHATSAPP_ADS_BLOKS_BILLING_CCT_NEXT_BUTTON";
                    case 11531:
                        return "WHATSAPP_ADS_CREATE_AD_ACTION";
                    case 11681:
                        return "WHATSAPP_ADS_FAST_TRACK_LOAD";
                    case 12237:
                        return "WHATSAPP_ADS_WHATSAPP_CTWA_THREAD_CREATION";
                    case 12554:
                        return "WHATSAPP_ADS_EMBEDDED_PAYMENT_SCREEN_LOAD";
                    case 12647:
                        return "WHATSAPP_ADS_LONG_TERM_HOLDOUT_CONFIG_FETCH";
                    case 13380:
                        return "WHATSAPP_ADS_CTWA_UI_TTRC";
                    case 14654:
                        return "WHATSAPP_ADS_MANAGE_ADS_FETCH_TOKEN";
                    case 14760:
                        return "WHATSAPP_ADS_WEB_VIEW_LOAD";
                    case 14769:
                        return "WHATSAPP_ADS_AD_DETAILS_SCREEN_LOAD";
                    case 15107:
                        return "WHATSAPP_ADS_AD_MEDIA_UPLOAD";
                    case 15144:
                        return "WHATSAPP_ADS_DESIGN_AD_STEP_LOAD";
                    case 15316:
                        return "WHATSAPP_ADS_CONSENT_SCREEN_LOAD";
                    case 15318:
                        return "WHATSAPP_ADS_MESSAGING_GUIDE_TTRC";
                    case 16301:
                        return "WHATSAPP_ADS_MANAGE_ADS_FETCH_ADS";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            default:
                return "UNDEFINED_QPL_MODULE";
        }
    }
}
