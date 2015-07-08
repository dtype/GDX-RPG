package com.rpsg.rpg.core;

import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;
import com.rpsg.rpg.object.base.Persistence;
import com.rpsg.rpg.system.base.Res;
import com.rpsg.rpg.utils.display.AlertUtil;

public class Setting {
	public static final String GAME_VERSION="Build 173 20150616";
	public static final String GDXRPG_VERSION="Alpha 40";
	//资源路径
	public static final String GAME_RES_PATH="";
	public static final String GAME_RES_IMAGE="images";
	
	public static final String GAME_RES_IMAGE_NUMBER	=GAME_RES_PATH+GAME_RES_IMAGE+"/number/";
	public static final String GAME_RES_IMAGE_BACKGROUND=GAME_RES_PATH+GAME_RES_IMAGE+"/background/";
	public static final String GAME_RES_IMAGE_LOGO		=GAME_RES_PATH+GAME_RES_IMAGE+"/logo/";
	public static final String GAME_RES_IMAGE_LOAD		=GAME_RES_PATH+GAME_RES_IMAGE+"/load/";
	public static final String GAME_RES_IMAGE_TITLE		=GAME_RES_PATH+GAME_RES_IMAGE+"/title/";
	public static final String GAME_RES_IMAGE_FG 		=GAME_RES_PATH+GAME_RES_IMAGE+"/fg/";
	
	public static final String GAME_RES_MUSIC_BGM		=GAME_RES_PATH				 +"sound/bgm/";
	public static final String GAME_RES_MUSIC_SE		=GAME_RES_PATH				 +"sound/se/";
	public static final String GAME_RES_MAP				=GAME_RES_PATH				 +"maps/";
	
	public static final String GAME_RES_IMAGE_BG		=GAME_RES_PATH+GAME_RES_IMAGE+"/background/";
	public static final String GAME_RES_IMAGE_MENU		=GAME_RES_PATH+GAME_RES_IMAGE+"/menu/";
	
	//Menu images/menu/
	public static final String GAME_RES_IMAGE_MENU_GLOBAL		=GAME_RES_IMAGE_MENU +"global/";
	public static final String GAME_RES_IMAGE_MENU_NEW_GLOBAL	=GAME_RES_IMAGE_MENU +"nglobal/";
	public static final String GAME_RES_IMAGE_MENU_MAP			=GAME_RES_IMAGE_MENU +"map/";
	public static final String GAME_RES_IMAGE_MENU_EQUIP		=GAME_RES_IMAGE_MENU +"equip/";
	public static final String GAME_RES_IMAGE_MENU_SC			=GAME_RES_IMAGE_MENU +"sc/";
	public static final String GAME_RES_IMAGE_MENU_ITEM			=GAME_RES_IMAGE_MENU +"item/";
	public static final String GAME_RES_IMAGE_MENU_STATUS		=GAME_RES_IMAGE_MENU +"status/";
	public static final String GAME_RES_IMAGE_MENU_SYSTEM		=GAME_RES_IMAGE_MENU +"system/";
	public static final String GAME_RES_IMAGE_MENU_TACTIC		=GAME_RES_IMAGE_MENU +"tactic/";
		
	public static final String GAME_RES_MESSAGE			=GAME_RES_PATH+GAME_RES_IMAGE+"/message/";
	public static final String GAME_RES_WALK			=GAME_RES_PATH+GAME_RES_IMAGE+"/walk/";
	public static final String GAME_RES_SHADER			=GAME_RES_PATH				 +"shader/";
	public static final String GAME_RES_IMAGE_GLOBAL	=GAME_RES_PATH+GAME_RES_IMAGE+"/global/";
	public static final String GAME_RES_IMAGE_ICONS		=GAME_RES_PATH+GAME_RES_IMAGE+"/icons/";
	public static final String GAME_RES_PARTICLE		=GAME_RES_PATH				 +"particle/";

	
	//存档最大页数
	public static final int GAME_SAVE_FILE_MAX_PAGE=20;
	
	//高级个性化系统设置存储
	public static final String GAME_PERSISTENCE="save/";
	public static Persistence persistence;
	
	//文本间距
	public static final int STRING_PADDING_TB=3;
	public static final int STRING_PADDING_LR=1;
	
	//系统菜单文字显示速度默认显示文字
	public static final String GAME_MENU_SYSTEM_TEST_MESSAGE="人类为何要互相伤害呢？";
	
	//UI
	public static NinePatchDrawable UI_BUTTON;
	public static String UI_BASE_IMG=Setting.GAME_RES_IMAGE_MENU_NEW_GLOBAL+"white.jpg";
	public static void init(){
		UI_BUTTON=new NinePatchDrawable(AlertUtil.processNinePatchFile(Setting.GAME_RES_IMAGE_MENU_NEW_GLOBAL+"button_p.png"));
	}
	
}