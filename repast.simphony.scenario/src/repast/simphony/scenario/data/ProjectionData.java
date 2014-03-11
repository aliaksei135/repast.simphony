package repast.simphony.scenario.data;

/**
 * Encapsulates metadata about a projection in ContextData heirarchy.
 * 
 * @author Nick Collier
 */
public class ProjectionData extends AttributeContainer {
  
	// These string types help support core projections.
	//   TODO Projections: perhaps refactor this out and use the projection registry.
	public static final String NETWORK_TYPE = "NETWORK";
	public static final String GRID_TYPE = "GRID";
	public static final String CONTINUOUS_SPACE_TYPE = "CONTINUOUS_SPACE";
	public static final String VALUE_LAYER_TYPE = "VALUE_LAYER";
	
	/*
	 * The Geography type should only be referenced to support conversion of old
	 *   Score files that support SGeographyImpl.
	 */
	@Deprecated
	public static final String GEOGRAPHY_TYPE = "GEOGRAPHY";
	
//  private ProjectionType type;
	private String type;
  
  public ProjectionData(String id, String type) {
    super(id);
    this.type = type;
  }

  /**
   * Gets the projection's type.
   * 
   * @return the projection's type.
   */
  public String getType() {
    return type;
  }
}
