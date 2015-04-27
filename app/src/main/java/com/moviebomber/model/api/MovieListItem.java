package com.moviebomber.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * This class is used to store the response of movie list query API.
 * Created by engine on 15/3/29.
 */
public class MovieListItem {

	@Expose
	private String duration;
	@Expose
	private Integer id;
	@SerializedName("release_date")
	@Expose
	private String releaseDate;
	@SerializedName("thumbnail_path")
	@Expose
	private String thumbnailPath;
	@SerializedName("title_chinese")
	@Expose
	private String titleChinese;
	@SerializedName("photo_list")
	@Expose
	private ArrayList<Photo> photoLists;
	@SerializedName("article_list")
	@Expose
	private ArrayList<Article> articleList;

	private int goodBomber = 0;
	private int normalBomber = 0;
	private int badBomber = 0;

	/**
	 *
	 * @return
	 * The duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 *
	 * @param duration
	 * The duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 *
	 * @return
	 * The id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 * The id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 * The releaseDate
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 *
	 * @param releaseDate
	 * The release_date
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 *
	 * @return
	 * The thumbnailPath
	 */
	public String getThumbnailPath() {
		return thumbnailPath;
	}

	/**
	 *
	 * @param thumbnailPath
	 * The thumbnail_url
	 */
	public void setThumbnailPath(String thumbnailPath) {
		this.thumbnailPath = thumbnailPath;
	}

	/**
	 *
	 * @return
	 * The titleChinese
	 */
	public String getTitleChinese() {
		return titleChinese;
	}

	/**
	 *
	 * @param titleChinese
	 * The title_chinese
	 */
	public void setTitleChinese(String titleChinese) {
		this.titleChinese = titleChinese;
	}

	public ArrayList<Photo> getPhotoLists() {
		return photoLists;
	}

	public void setPhotoLists(ArrayList<Photo> photoLists) {
		this.photoLists = photoLists;
	}

	public ArrayList<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(ArrayList<Article> articleList) {
		this.articleList = articleList;
	}

	public int getGoodBomber() {
		return goodBomber;
	}

	public void setGoodBomber(int goodBomber) {
		this.goodBomber = goodBomber;
	}

	public int getNormalBomber() {
		return normalBomber;
	}

	public void setNormalBomber(int normalBomber) {
		this.normalBomber = normalBomber;
	}

	public int getBadBomber() {
		return badBomber;
	}

	public void setBadBomber(int badBomber) {
		this.badBomber = badBomber;
	}
}
