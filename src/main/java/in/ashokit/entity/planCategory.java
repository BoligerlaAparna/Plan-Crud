package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="PLAN_CATEGORY")
public class planCategory {
	
	@Id
	@Column(name ="CATEGORY_ID")
	private Integer categoryId;
	
	@Column(name ="CATEGORY_NAME")
	private String categoryName;
	
	@Column(name ="ACTIVE_SW")
	private String activeSw;
	
	@Column(name ="CREATED_BY")
	private String createBy;
	
	@Column(name ="UPDATED_By")
	private String updateBy;
	
	@Column(name ="CREATED_DATE", updatable=false)
	@CreationTimestamp
	private LocalDate createDate;
	
	@Column(name ="UPDATED_DATE", insertable=false)
	@UpdateTimestamp
	private LocalDate UpdateDate;
	
	public planCategory()
	{
		
	}
	public planCategory(Integer categoryId, String categoryName, String activeSw, String createBy, String updateBy,
			LocalDate createDate, LocalDate updateDate) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.activeSw = activeSw;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		UpdateDate = updateDate;
	}
	

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		UpdateDate = updateDate;
	}
	
	
	

}
