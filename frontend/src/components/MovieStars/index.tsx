import { ReactComponent as StarFull} from 'asper/img/star-full.svg';
import { ReactComponent as StarHalf} from 'asper/img/star-half.svg';
import { ReactComponent as StarEmpty} from 'asper/img/star-empty.svg';
import './styles.css';

function MovieStars() {

    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    );
}
export default MovieStars;